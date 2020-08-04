package com.vf.utilerias;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogHandler 
{
	
	private static String NO_UID = " NO UID ";
	private static String NO_CLASS = " NO CLASS ";
	private static String NO_MSG = " NO MSG ";
	
	private static String SEPARADOR = " :: ";
  
	private static Logger logError;
	private static Logger logMonitor;
	private static Logger logConsola;
	private static Logger logEntidad;
	  
	static
		{
		//Se aaranca el Log
		instanceLog( );
		
		logConsola 	= Logger.getLogger( "consola"     ); 
		logError 	= Logger.getLogger( "errors"      ); 
		logMonitor	= Logger.getLogger( "monitor"     );
		logEntidad  = Logger.getLogger( "infoEntidad" );
		}
 
	private LogHandler() 
		{
		}
	
	private static void instanceLog()
		{
		try	
			{
			DOMConfigurator.configure( LogHandler.class.getResource( "log4j.cfg.xml" ) );
			} 
		catch ( javax.xml.parsers.FactoryConfigurationError factoryConfigurationError ) 
			{
			System.err.println(	"* * * Cargando Aplicacion Web - MambuUtilerias..." + factoryConfigurationError.getMessage() );
			System.err.println(	"---------------------------------------------------------------------" );
			}
		}
	
	private static String formatMsg ( String uid, String msg )
		{
		return ( uid != null ? uid : NO_UID ) +  SEPARADOR +( msg != null ? msg : NO_MSG );
		}
	
	private static String formatMsg ( String uid, Class<?> c, String msg )
		{
		return ( uid != null ? uid : NO_UID ) + SEPARADOR +  ( c != null ? c.getSimpleName() : NO_CLASS ) + SEPARADOR +( msg != null ? msg : NO_MSG );
		}
	

	private static String formatException ( Exception exception )
		{
		return ( exception.getCause() + SEPARADOR + exception.getMessage() + SEPARADOR + formatStackTrace( exception.getStackTrace() ) );
		}

	private synchronized static String formatStackTrace( StackTraceElement[] stackElements )
		{
		StringBuffer buffer = new StringBuffer();
		for ( int i = 0; i < stackElements.length; i ++)
			{
			buffer.append( "\n\t" );
			buffer.append( stackElements[i].toString() );
			}
		return buffer.toString();
		} 
	
	public static void debug(String uid, Class<?> c, String msg) 
		{
		logConsola.debug( formatMsg ( uid, c, msg  ) );
		}
	
	public static void info(String uid,  Class<?> c,String msg) 
		{
 		logMonitor.info( formatMsg ( uid, msg ) );
		}
 
	public static void warn(String uid, Class<?> c, String msg) 
		{
		logMonitor.warn( formatMsg ( uid, c, msg ) );
		}

	public static void error(String uid, Class<?> c, String msg, Exception e ) 
		{
		logError.error( formatMsg ( uid, c, msg ) +  SEPARADOR + formatException( e ));
		}
	
	public static void trace(String uid, Class<?> c, String msg)
		{
		logEntidad.trace( formatMsg ( uid, c, msg ) );
		}

}
