package com.vf.entidades;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="headerRequest")
public class HeaderRequest 
{
	@XmlElement(name="idUsuario")
	public String IdUsuario;
	
	@XmlElement(name="fechaOperacion")
	public String FechaOperacion;

	
	@XmlElement(name="idOperacion")
	public String IdOperacion;
	
	
}
