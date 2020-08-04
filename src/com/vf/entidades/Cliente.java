package com.vf.entidades;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="cliente") 
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2561144719134421690L;

	
	public Cliente()
	{
		//System.out.print("AAA");
	}
	
		
	@XmlElement(name="idCliente")
	private String idCliente;
	
	@XmlElement(name="nombreCliente")
	private String nombreCliente;
	
	@XmlElement(name="ciclo")
	private int ciclo;
	
	@XmlElement(name="edad")
	private int edad;
	
	@XmlElement(name="montoCreditoActual")
	private double montoCreditoActual;
	
	@XmlElement(name="montoSolicitado")
	private double montoSolicitado;
	
	@XmlElement(name="porcentajeMontoPrincipal")
	private double porcentajeMontoPrincipal;
	
	@XmlElement(name="garantia")
	private Boolean garantia;
	
	@XmlElement(name="aval")
	private Boolean aval;
	
	@XmlElement(name="renovacion")
	private Boolean renovacion; 
	
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
	
	@XmlElement(name="clabeContrato")
	private String clabeContrato;
	
	public String getClabeContrato() {
		return clabeContrato;
	}
	public void setClabeContrato(String clabeContrato) {
		this.clabeContrato = clabeContrato;
	}
	public String getTitularCuenta() {
		return titularCuenta;
	}
	public void setTitularCuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}


	@XmlElement(name="titularCuenta")
	private String titularCuenta;	
	
	public String getClabe() {
		return clabe;
	}
	public void setClabe(String clabe) {
		this.clabe = clabe;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public int getEdad() {
		return edad;
	}
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getMontoCreditoActual() {
		return montoCreditoActual;
	}
	public void setMontoCreditoActual(double montoCreditoActual) {
		this.montoCreditoActual = montoCreditoActual;
	}
	public double getMontoSolicitado() {
		return montoSolicitado;
	}
	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	public double getPorcentajeMontoPrincipal() {
		return porcentajeMontoPrincipal;
	}
	public void setPorcentajeMontoPrincipal(double porcentajeMontoPrincipal) {
		this.porcentajeMontoPrincipal = porcentajeMontoPrincipal;
	}
	public Boolean getGarantia() {
		return garantia;
	}
	public void setGarantia(Boolean garantia) {
		this.garantia = garantia;
	}
	public Boolean getAval() {
		return aval;
	}
	public void setAval(Boolean aval) {
		this.aval = aval;
	}
	public void setRenovacion(Boolean renovacion) {
		this.renovacion = renovacion;
	}
	public Boolean isRenovacion() {
		return renovacion;
	}
	
	public String getBancoDesembolso()
	{
		return bancoDesembolso;
	}
	
	public void setBancoDesembolso(String bancoDesembolso)
	{
		this.bancoDesembolso = bancoDesembolso;
	}
	
	public String getFormaDesembolso() {
		return formaDesembolso.trim();
	}

	
	public void setFormaDesembolso(String formaDesembolso) {
		this.formaDesembolso = formaDesembolso.trim();
	}
	
	public String getTipoDesembolso() {
		return tipoDesembolso;
	}
	
	public void setTipoDesembolso(String tipoDesembolso) {
		this.tipoDesembolso = tipoDesembolso;
	}

	public Boolean bancoisEmpty() {  
        if(this.banco == null || this.banco.isEmpty())
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }  

    public Boolean clabeisEmpty() {  
    	if(this.clabe == null || this.clabe.isEmpty())
        {
        	return true;
        }
        else
        {
        	return false;
        }  
    }
    
    public Boolean clabeContratoisEmpty() {  
    	if(this.clabeContrato == null || this.clabeContrato.isEmpty())
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
    
    public Boolean titularisEmpty() {  
    	if(this.titularCuenta == null || this.titularCuenta.isEmpty())
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
}
