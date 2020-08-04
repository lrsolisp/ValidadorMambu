package com.vf.utilerias;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;


import com.vf.entidades.Contenedor;
import com.vf.entidades.Sucursal;

public class Parser 
{
	
	
	public static Contenedor deXmlAObjeto(String operacionId, String xml) throws Exception
	{
		JAXBContext jaxbContext = null;
		Contenedor contenedor  = null;
		
		try 
		{
						
			XMLInputFactory xmlif = XMLInputFactory.newInstance();
			
			XMLStreamReader streamReader = xmlif.createXMLStreamReader(new StringReader(xml));
			jaxbContext = JAXBContext.newInstance(Contenedor.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller(); 
			contenedor = (Contenedor) unmarshaller.unmarshal(streamReader); 

		} 
		catch (JAXBException | XMLStreamException e) 
		{
			LogHandler.error( operacionId, Parser.class, "Error en deXmlAObjeto >> " + e.getStackTrace().toString(), e );
			throw e;
			//e.printStackTrace();
		}
		finally
		{
			jaxbContext = null;

		}
		
		return contenedor;
	}

	
	
	
	public static String deObjetoAXml(String operacionId,Contenedor contenedor) {


		String xml = "";
		JAXBContext jaxbContext = null;								

		try 
		{

			jaxbContext = JAXBContext.newInstance(Contenedor.class, Sucursal.class);
			Marshaller marshaller = jaxbContext.createMarshaller();

			StringWriter sw = new StringWriter();
			QName qName = new QName("", "Contenedor");			 
			JAXBElement<Contenedor> root = new JAXBElement<Contenedor>(qName, Contenedor.class, contenedor);

			marshaller.marshal(root, sw);
			xml= sw.toString();

			marshaller= null;			
			sw = null;
			qName = null;
			root = null;

		} 
		catch (JAXBException e) 
		{
			LogHandler.error( operacionId, Parser.class, "Error en deObjetoAXml >> " + e.getStackTrace().toString(), e );
			//e.printStackTrace();
		}
		finally
		{
			jaxbContext = null;			
		}


		LogHandler.info( operacionId, Parser.class, "Datos de Salida :" + xml );

		return xml;
	}
	
}
