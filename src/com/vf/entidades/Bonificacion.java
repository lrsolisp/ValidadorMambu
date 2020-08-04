package com.vf.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="bonificacion") 
@XmlAccessorType(XmlAccessType.FIELD)
public class Bonificacion implements Serializable  
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8780244358621998333L;

	
	public Bonificacion()
	{
		this.mensajes = new java.util.ArrayList<Mensaje>();
	}
	
	
	@XmlElement(name="idRegistro")
	private String idRegistro ;
	
	@XmlElement(name="idCredito")
	private String idCredito ;
	
	@XmlElement(name="idContrato")
	private String idContrato ;
	
	@XmlElement(name="idGrupo")
	private String idGrupo ;
	
	@XmlElement(name="idCliente")
	private String idCliente ;
	
	@XmlElement(name="encodedKeyContrato")
	private String encodedKeyContrato ;
	
	@XmlElement(name="fechaGenerada")
	private Date fechaGenerada ;
	
	@XmlElement(name="fechaAprobada")
	private Date fechaAprobada ;
	
	@XmlElement(name="fechaContrato")
	private Date fechaContrato ;
	
	@XmlElement(name="idRegistroJustificante")
	private String idRegistroJustificante ;
	
	@XmlElement(name="montoSolicitado")
	private double montoSolicitado ;
	
	@XmlElement(name="montoBaseBonificacion")
	private double montoBaseBonificacion ;
	
	@XmlElement(name="montoBonificacion")
	private double montoBonificacion ;
	
	@XmlElement(name="interesPagado")
	private double interesPagado ;
		
	@XmlElement(name="porcentajeBonificacion")
	private double porcentajeBonificacion ;
		
	@XmlElement(name="porcentajeCumplimientoAtraso")
	private double porcentajeCumplimientoAtraso ;
	
	@XmlElement(name="porcentajeCumplimientoPlazo")
	private double porcentajeCumplimientoPlazo ;
	
	@XmlElement(name="cicloCliente")
	private int cicloCliente ;
	
	@XmlElement(name="cicloGrupo")
	private int cicloGrupo ;
	
	@XmlElement(name="tasaInteres")
	private double tasaInteres ;
	
	@XmlElement(name="producto")
	private String producto ;
	
	@XmlElement(name="metodologia")
	private String metodologia ;
	
	@XmlElement(name="estatus")
	private String estatus ;
	
	@XmlElement(name="tipoCredito")
	private String tipoCredito ;
		
	@XmlElement(name="tipoCalculo")
	private String tipoCalculo ;
	
	@XmlElement(name="recalcular")
	private String recalcular ;
		
	@XmlElementWrapper    
	@XmlElement(name="mensaje")
	private java.util.List<Mensaje> mensajes;
	
	
	private String codigoMensaje;
	
	
	public String getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}
	public String getIdCredito() {
		return idCredito;
	}
	public void setIdCredito(String idCredito) {
		this.idCredito = idCredito;
	}
	public String getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(String idContrato) {
		this.idContrato = idContrato;
	}
	public String getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getEncodedKeyContrato() {
		return encodedKeyContrato;
	}
	public void setEncodedKeyContrato(String encodedKeyContrato) {
		this.encodedKeyContrato = encodedKeyContrato;
	}
	public Date getFechaGenerada() {
		return fechaGenerada;
	}
	public void setFechaGenerada(Date fechaGenerada) {
		this.fechaGenerada = fechaGenerada;
	}
	public Date getFechaAprobada() {
		return fechaAprobada;
	}
	public void setFechaAprobada(Date fechaAprobada) {
		this.fechaAprobada = fechaAprobada;
	}
	public Date getFechaContrato() {
		return fechaContrato;
	}
	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	public String getIdRegistroJustificante() {
		return idRegistroJustificante;
	}
	public void setIdRegistroJustificante(String idRegistroJustificante) {
		this.idRegistroJustificante = idRegistroJustificante;
	}
	public double getMontoSolicitado() {
		return montoSolicitado;
	}
	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	
	public double getMontoBaseBonificacion() {
		return montoBaseBonificacion;
	}
	public void setMontoBaseBonificacion(double montoBaseBonificacion) {
		this.montoBaseBonificacion = montoBaseBonificacion;
	}
	
	public double getInteresPagado() {
		return interesPagado;
	}
	public void setInteresPagado(double interesPagado) {
		this.interesPagado = interesPagado;
	}
	
	public double getMontoBonificacion() {
		return montoBonificacion;
	}
	public void setMontoBonificacion(double montoBonificacion) {
		this.montoBonificacion = montoBonificacion;
	}
	public int getCicloCliente() {
		return cicloCliente;
	}
	public void setCicloCliente(int cicloCliente) {
		this.cicloCliente = cicloCliente;
	}
	public int getCicloGrupo() {
		return cicloGrupo;
	}
	public void setCicloGrupo(int cicloGrupo) {
		this.cicloGrupo = cicloGrupo;
	}
	public double getTasa() {
		return tasaInteres;
	}
	public void setTasa(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getMetodologia() {
		return metodologia;
	}
	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getTipoCredito() {
		return tipoCredito;
	}
	public void setTipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
	}
	
	public String getRecalcular() {
		return recalcular;
	}
	public void setRecalcular(String recalcular) {
		this.recalcular = recalcular;
	}
	public String getCodigoMensaje() {
		return codigoMensaje;
	}
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
	public double getPorcentajeBonificacion() {
		return porcentajeBonificacion;
	}
	
	public void setPorcentajeBonificacion(double porcentajeBonificacion) {
		this.porcentajeBonificacion = porcentajeBonificacion;
	}
	
	public java.util.List<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(java.util.List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
		
	public double getPorcentajeCumplimientoAtraso() {
		return this.porcentajeCumplimientoAtraso;
	}
	
	public void setPorcentajeCumplimientoAtraso(double porcentajeCumplimientoAtraso) {
		this.porcentajeCumplimientoAtraso = porcentajeCumplimientoAtraso;
	}
		
	public double getPorcentajeCumplimientoPlazo() {
		return this.porcentajeCumplimientoPlazo;
	}
	
	public void setPorcentajeCumplimientoPlazo(double porcentajeCumplimientoPlazo) {
		this.porcentajeCumplimientoPlazo = porcentajeCumplimientoPlazo;
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
	
}
