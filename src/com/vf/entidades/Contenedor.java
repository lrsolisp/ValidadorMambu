package com.vf.entidades;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Contenedor")
public class Contenedor implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 463821428114915832L;



	public Contenedor()
	{
		this.bonificaciones = new java.util.ArrayList<Bonificacion>();
	}
	
		
	@XmlElement(name="headerRequest")
	public HeaderRequest headerRequest;
	
	
	@XmlElement(name="contratoValidador")
	public Contrato contrato;
	
	
	@XmlElement(name="Grupo")
	public Grupo grupo;
	
	
	@XmlElement(name="HeaderResponse")
	public HeaderResponse headerResponse;
	
	
	
	@XmlElementWrapper    
	@XmlElement(name="bonificacion")
	public java.util.List<Bonificacion> bonificaciones;
	
		
}
