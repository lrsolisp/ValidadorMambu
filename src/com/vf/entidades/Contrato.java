package com.vf.entidades;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="contratoValidador") 
@XmlAccessorType(XmlAccessType.FIELD)
public class Contrato implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2660782913770671927L;
	
	private static final String EMPTY_STRING = "";

	@XmlElement(name="id")
	private String id;
	
	
	@XmlElement(name="metodologia")
	private String metodologia;
	
	
	@XmlElement(name="frecuenciaPagoUnidad")
	private String frecuenciaPagoUnidad;
	
	
	@XmlElement(name="frecuenciaPago")
	private String frecuenciaPago;
	
	
	@XmlElement(name="producto")
	private String producto;
		
	
	@XmlElement(name="tipoCredito")
	private String tipoCredito;
	
	/*
	private java.math.BigDecimal montoGrupal;
	private java.math.BigDecimal indiceLiquidez;
	private java.math.BigDecimal tasaInteres;
	*/
	@XmlElement(name="montoGrupal")
	private double montoGrupal;
	
	
	@XmlElement(name="razonOtorgamiento")
	private double razonOtorgamiento;
	
	
	@XmlElement(name="tasaInteres")
	private double tasaInteres;
	
	
	@XmlElement(name="numeroIntegrantes")
	private int numeroIntegrantes;
	
	
	@XmlElement(name="sucursal")
	private int sucursal;
	
	
	@XmlElement(name="plazo")
	private int plazo;
	
	
	@XmlElement(name="edad")
	private int edad;
	
	
	@XmlElement(name="cicloGrupo")
	private int cicloGrupo;
	
	
	@XmlElement(name="frecuenciaPagoNumero")
	private String frecuenciaPagoNumero;
	
	
	@XmlElement(name="tieneGracia")
	public String tieneGracia;
	
	
	@XmlElement(name="renovacion")
	private Boolean renovacion; 
	
	
	@XmlElementWrapper    
	@XmlElement(name="cliente")
	private java.util.List<Cliente> clientes;
	
	
	@XmlElementWrapper    
	@XmlElement(name="mensaje")
	private java.util.List<Mensaje> mensajes;
	
	
	private String codigoMensaje;
	
	@XmlElement(name="formaDesembolso")
	private String formaDesembolso;

	@XmlElement(name="bancoDesembolso")
	private String bancoDesembolso;

	@XmlElement(name="tipoDesembolso")
	private String tipoDesembolso;	

	@XmlElement(name="clabe")
	private String clabe;	

	@XmlElement(name="banco")
	private String banco;	
	

	
	public Contrato()
	{
		clientes = new java.util.ArrayList<Cliente>();
		mensajes = new java.util.ArrayList<Mensaje>();
		this.setCodigoMensaje(EMPTY_STRING);
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMetodologia() {
		return metodologia;
	}

	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}

	public String getFrecuenciaPago() {
		return frecuenciaPago;
	}

	public void setFrecuenciaPagoUnidad(String frecuenciaPagoUnidad) {
		this.frecuenciaPagoUnidad = frecuenciaPagoUnidad;
	}
	
	public String getFrecuenciaPagoUnidad() {
		return frecuenciaPagoUnidad;
	}

	public void setFrecuenciaPago(String frecuenciaPago) {
		this.frecuenciaPago = frecuenciaPago;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}	

	public int getNumeroIntegrantes() {
		return numeroIntegrantes;
	}

	public void setNumeroIntegrantes(int numeroIntegrantes) {
		this.numeroIntegrantes = numeroIntegrantes;
	}
	
	
	
	public int getCicloGrupo() {
		return cicloGrupo;
	}

	public void setCicloGrupo(int cicloGrupo) {
		this.cicloGrupo = numeroIntegrantes;
	}
	
	
	public String getFrecuenciaPagoNumero() {
		return frecuenciaPagoNumero;
	}

	public void setFrecuenciaPagoNumero(String frecuenciaPagoNumero) {
		this.frecuenciaPagoNumero = frecuenciaPagoNumero;
	}

	public int getSucursal() {
		return sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public java.util.List<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(java.util.List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	
	
	public void setMensaje(String idIntegrante, String mensaje, String codigoMensaje)
	{
		Mensaje msj = new Mensaje();
		msj.setIdIntegrante(idIntegrante);
		msj.setDescripcionMensaje(mensaje);
		msj.setTipoMensaje(codigoMensaje);		
		
		this.mensajes.add(msj);
		
		msj = null;
	}	

	public Boolean isRenovacion() {
		return renovacion;
	}

	public void setRenovacion(Boolean renovacion) {
		this.renovacion = renovacion;
	}

	public String getTipoCredito() {
		return tipoCredito;
	}

	public void setTipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
	}


	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getMontoGrupal() {
		return montoGrupal;
	}

	public void setMontoGrupal(double montoGrupal) {
		this.montoGrupal = montoGrupal;
	}

	public double getRazonOtorgamiento() {
		return razonOtorgamiento;
	}

	public void setRazonOtorgamiento(double razonOtorgamiento) {
		this.razonOtorgamiento = razonOtorgamiento;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}


	public java.util.List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(java.util.List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public String getCodigoMensaje() {
		return codigoMensaje;
	}


	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
	
	public String getTieneGracia() {
		return tieneGracia;
	}

	
	public void setTieneGracia(String tieneGracia) {
		this.tieneGracia = tieneGracia;
	}
	
	public String getFormaDesembolso() {
		return formaDesembolso;
	}

	
	public void setFormaDesembolso(String formaDesembolso) {
		this.formaDesembolso = formaDesembolso;
	}
	
	public String getTipoDesembolso() {
		return tipoDesembolso;
	}

	
	public void setTipoDesembolso(String tipoDesembolso) {
		this.tipoDesembolso = tipoDesembolso;
	}

	public void setBancoDesembolso(String bancoDesembolso)
	{
		this.bancoDesembolso = bancoDesembolso;
	}
	
	public String getBancoDesembolso() {
		return bancoDesembolso;
	}
	
	public boolean bancoisEmpty() {  
        return this.bancoDesembolso.isEmpty();  
    }  

    public boolean clabeisEmpty() {  
        return this.clabe.isEmpty();
    }
}
