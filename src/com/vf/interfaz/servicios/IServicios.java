package com.vf.interfaz.servicios;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;



@WebService
@SOAPBinding(style = Style.RPC)
public interface IServicios 
{
	
	
	@WebMethod
	String validarGrupo(String peticion);
	
	
	@WebMethod
	String validarBonificacion(String peticion);


}
