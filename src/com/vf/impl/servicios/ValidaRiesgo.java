package com.vf.impl.servicios;

import com.openrules.ruleengine.OpenRulesEngine;
import com.vf.entidades.Bonificacion;
import com.vf.entidades.Cliente;
import com.vf.entidades.Contenedor;

import com.vf.entidades.HeaderResponse;
import com.vf.entidades.Mensaje;
import com.vf.interfaz.servicios.IServicios;

import com.vf.utilerias.LogHandler;
import com.vf.utilerias.Parser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javax.jws.WebService;


@WebService(endpointInterface = "com.vf.interfaz.servicios.IServicios")
public class ValidaRiesgo implements IServicios
{
		
	
	private static String nombreDelMetodoInicialDeReglas = "";
	private static String nombreDelArchivoPrincipalDeReglas = "";	
	
	
	// método que valida si los integrantes de un grupo son 
	// candidatos para que se les otorgue un préstamo
	@Override
	public String validarGrupo(String peticion)
	{
		ResourceBundle paramConfig = null;
		
		String respuestaXML = "";
		
		//final java.lang.String operacionId = GUIDGenerator.generateGUID( new Object( ) );
		
		//Se convierte el XML
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();		
		
		Contenedor contenedor = null;
		java.lang.String operacionId = "";
		HeaderResponse headerResponse = new HeaderResponse();				
		
		try
		{					
			contenedor = Parser.deXmlAObjeto("", peticion);
			operacionId = contenedor.headerRequest.IdOperacion;
			
			
			
			System.out.println(" >> INICIA PROCESO VALIDARGRUPO : " + dateFormat.format(date) + " >> " + contenedor.contrato.getId());
											
			LogHandler.info( operacionId, getClass( ), "Datos de entrada validarGrupo( ): " + peticion );									
						
			//Se obtienen las configuraciones para leer los archivos de las reglas
			paramConfig = ResourceBundle.getBundle("com.vf.config.configuracionMambu");
			
			nombreDelArchivoPrincipalDeReglas 	= paramConfig.getString("archivoPrincipalMotorReglasCreditos");
			nombreDelMetodoInicialDeReglas 		= paramConfig.getString("metodoInicialMotorReglasCreditos");
					
			OpenRulesEngine engine = new OpenRulesEngine(nombreDelArchivoPrincipalDeReglas);
			
			
			
			// se iteran los clientes para mandarlos a validar a las reglas
			for( Cliente cliente: contenedor.contrato.getClientes())
			{		
				Object[] objects = { contenedor.contrato, cliente };
				System.out.println(cliente.getIdCliente());
				engine.run(nombreDelMetodoInicialDeReglas, objects);
			}
			
			// se iteran los Mensajes para ver la respuesta
			
			for( Mensaje mensaje: contenedor.contrato.getMensajes())
			{
				System.out.println(mensaje.getDescripcionMensaje());				
			}
			
			
			headerResponse.setEstatus("1");
			headerResponse.setMensaje("Contrato Validado Correctamente");																					
						
			engine = null;
			contenedor.headerResponse = headerResponse;
		}
		catch(Exception exception)
		{
			System.out.print(exception);
			headerResponse.setEstatus("-1");
			headerResponse.setMensaje(exception.getMessage());
			contenedor.headerResponse = headerResponse;
		}
		
			
		respuestaXML = Parser.deObjetoAXml(operacionId, contenedor);
		
		LogHandler.info( operacionId, getClass( ), "Datos de salida validarGrupo( ): " + respuestaXML );		
		//System.out.print(respuestaXML);
				
		date = new Date();		
		System.out.println(" >> FINALIZA PROCESO VALIDARGRUPO: " + dateFormat.format(date) + " >> ");
		
		contenedor = null;
		paramConfig = null;
		
		return respuestaXML;
	}


	
	
	
	
	// método para validar si un cliente es candidato a recibir 
	// su bonificación
	@Override
	public String validarBonificacion(String peticion) 
	{
		ResourceBundle paramConfig = null;
		String respuestaXML = "";
				
		//Se convierte el XML
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();		
		
		Contenedor contenedor = null;
		java.lang.String operacionId = "";
		HeaderResponse headerResponse = new HeaderResponse();				
		
		try
		{							
			contenedor = Parser.deXmlAObjeto("", peticion);			
			
			operacionId = contenedor.headerRequest.IdOperacion;
			
			System.out.print(" >> INICIA PROCESO VALIDAR BONIFICACION: " + dateFormat.format(date) + " >> ");
			
			LogHandler.info( operacionId, getClass( ), "Datos de entrada validarBonificacion( ): " + peticion );									
						
			//Se obtienen las configuraciones para leer los archivos de las reglas
			paramConfig = ResourceBundle.getBundle("com.vf.config.configuracionMambu");
			
			nombreDelArchivoPrincipalDeReglas 	= paramConfig.getString("archivoPrincipalMotorReglasBonificaciones");
			nombreDelMetodoInicialDeReglas 		= paramConfig.getString("metodoInicialMotorReglasBonificaciones");
					
			OpenRulesEngine engine = new OpenRulesEngine(nombreDelArchivoPrincipalDeReglas);
						
			
			// se iteran los clientes para mandarlos a validar a las reglas
			for( Bonificacion bonificacion: contenedor.bonificaciones)
			{
				Object[] objects = { bonificacion };						
								
				engine.run(nombreDelMetodoInicialDeReglas, objects);
								
				bonificacion.setMontoBonificacion( (bonificacion.getMontoBaseBonificacion( ) * ( bonificacion.getPorcentajeBonificacion ( ) / 100 ) ) );

			}
			
			
			// se iteran los clientes para mandarlos a validar a las reglas
			/*
			for( Bonificacion bonificacion: contenedor.bonificaciones)
			{
				// se iteran los Mensajes para ver la respuesta
				for( Mensaje mensaje: bonificacion.getMensajes())
				{
					System.out.println(bonificacion.getPorcentajeCumplimientoAtraso() + "-" + bonificacion.getPorcentajeCumplimientoPlazo() + "-" + bonificacion.getEstatus() + "-"  +  mensaje.getDescripcionMensaje() + "-" + bonificacion.getMontoBonificacion());				
				}
			}
			*/
			
			
			headerResponse.setEstatus("1");
			headerResponse.setMensaje("Bonificaciones Generadas Correctamente");																					
						
			engine = null;
			contenedor.headerResponse = headerResponse;
		}
		catch(Exception exception)
		{
			headerResponse.setEstatus("-1");
			headerResponse.setMensaje(exception.getMessage());
			contenedor.headerResponse = headerResponse;
			LogHandler.info( operacionId, getClass( ), "Error Bonificación: " + exception.getMessage() );
		}
		
			
		respuestaXML = Parser.deObjetoAXml(operacionId, contenedor);
		
		//System.out.print(respuestaXML);
				
		date = new Date();
		System.out.println(" >> FINALIZA PROCESO VALIDAR BONIFICACION: " + dateFormat.format(date));
		LogHandler.info( operacionId, getClass( ), "Datos de salida validarBonificacion( ): " + respuestaXML );
		
		contenedor = null;
		headerResponse = null;
		paramConfig = null;
		
		return respuestaXML;
	}
	
}
