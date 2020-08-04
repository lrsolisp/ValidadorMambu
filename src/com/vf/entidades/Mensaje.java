package com.vf.entidades;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="mensaje") 
@XmlAccessorType(XmlAccessType.FIELD)
public class Mensaje implements Serializable 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8944622819370172584L;
	
	@XmlElement(name="idIntegrante")
	private String idIntegrante;
	
	@XmlElement(name="descripcionMensaje")
	private String descripcionMensaje;
	
	@XmlElement(name="codigoMensaje")
	private String codigoMensaje;
	
	@XmlElement(name="tipoMensaje")
	private String tipoMensaje;
	
			
	public String getIdIntegrante() {
		return idIntegrante;
	}
	public void setIdIntegrante(String idIntegrante) {
		this.idIntegrante = idIntegrante;
	}
	public String getDescripcionMensaje() {
		return descripcionMensaje;
	}
	public void setDescripcionMensaje(String mensaje) {
		this.descripcionMensaje = mensaje;
	}
	public String getTipoMensaje() {
		return tipoMensaje;
	}
	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}
	public String getCodigoMensaje() {
		return codigoMensaje;
	}
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

}
