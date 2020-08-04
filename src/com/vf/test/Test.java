package com.vf.test;

import com.vf.impl.servicios.ValidaRiesgo;
import com.vf.utilerias.constantes.ConstantesValidador;

public class Test 
{

	public static void main(String[] args) throws Exception 
	{				

		ValidaRiesgo validaRiesgo = new ValidaRiesgo();
		//validaRiesgo.validarGrupo("<Contenedor><headerRequest><idUsuario>avazqueza</idUsuario><fechaOperacion>20160329</fechaOperacion><idOperacion>1234567</idOperacion></headerRequest> <contratoValidador><id>777</id><frecuenciaPagoNumero>1</frecuenciaPagoNumero> <frecuenciaPagoUnidad>WEEKS</frecuenciaPagoUnidad> <frecuenciaPago>S</frecuenciaPago><producto>BC</producto><metodologia>UDE</metodologia><tipoCredito>P</tipoCredito><renovacion>false</renovacion><edad>17</edad><montoGrupal>21000</montoGrupal><indiceLiquidez>1.3</indiceLiquidez><plazo>7</plazo><numeroIntegrantes>7</numeroIntegrantes> <clientes><cliente><idCliente>123456</idCliente><nombreCliente>ADRIAN VAZQUEZ</nombreCliente><edad>35</edad><numeroRetrasos>0</numeroRetrasos><montoCreditoActual>13000</montoCreditoActual> <montoSolicitado>8000</montoSolicitado><porcentajeMontoPrincipal>0.00615</porcentajeMontoPrincipal> <garantia>true</garantia><aval>false</aval></cliente></clientes></contratoValidador></Contenedor>");
		//validaRiesgo.validarGrupo("<Contenedor>  <fullDetails>false</fullDetails>  <headerRequest>    <idUsuario>avazqueza</idUsuario>    <fechaOperacion>2016-07-26</fechaOperacion>    <idOperacion>79dc8b84-8c38-4fac-a8d7-ffbb091c9654</idOperacion>  </headerRequest>  <contratoValidador>    <clientes>      <cliente>        <idCliente>8a81867c55dfa15a0155e084f61b2ca0</idCliente>        <nombreCliente>BLANCA AYALA GUZMAN</nombreCliente>        <edad>42</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>40000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>10</ciclo>        <renovacion>true</renovacion>      </cliente>      <cliente>        <idCliente>8a81867c55dfa15a0155e084f4162c4e</idCliente>        <nombreCliente>BLANCA LILIA RUIZ MENDOZA</nombreCliente>        <edad>38</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>44000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>10</ciclo>        <renovacion>true</renovacion>      </cliente>      <cliente>        <idCliente>8a81867c55dfa15a0155e084f1da2bfc</idCliente>        <nombreCliente>JULIO CESAR GONZALEZ FRAGOSO</nombreCliente>        <edad>57</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>40000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>19</ciclo>        <renovacion>true</renovacion>      </cliente>      <cliente>        <idCliente>8a818766562917cb01562997b28a025c</idCliente>        <nombreCliente>KIMBERLY GONZALEZ AYALA</nombreCliente>        <edad>18</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>8000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>2</ciclo>        <renovacion>true</renovacion>      </cliente>      <cliente>        <idCliente>8a81867c55dfa15a0155e084f50e2c77</idCliente>        <nombreCliente>MIGUEL ANGEL GONZALEZ FRAGOSO</nombreCliente>        <edad>39</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>46000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>10</ciclo>        <renovacion>true</renovacion>      </cliente>    </clientes>    <mensajes />    <id>VFASBWMF688177584</id>    <metodologia>FAMILIA EMPRENDEDORA</metodologia>    <frecuenciaPagoNumero>1</frecuenciaPagoNumero>    <frecuenciaPagoUnidad>WEEKS</frecuenciaPagoUnidad>    <frecuenciaPago />    <producto>GS_SI</producto>    <tipoCredito>P</tipoCredito>    <cicloGrupo>0</cicloGrupo>    <nombreGrupo>Ecatepec</nombreGrupo>    <montoGrupal>178000</montoGrupal>    <indiceLiquidez>0</indiceLiquidez>    <tasaInteres>61</tasaInteres>    <numeroIntegrantes>5</numeroIntegrantes>    <sucursal>106</sucursal>    <plazo>24</plazo>    <edad>0</edad>    <renovacion>false</renovacion>  </contratoValidador>  <customFields />  <valores /></Contenedor>");
		
		//validaRiesgo.validarGrupo("<Contenedor>  <fullDetails>false</fullDetails>  <headerRequest>    <idUsuario>avazqueza</idUsuario>    <fechaOperacion>2016-12-23</fechaOperacion>    <idOperacion>d8074582-ff72-4ed2-a064-dc59169ff14d</idOperacion>  </headerRequest>  <contratoValidador>    <clientes>      <cliente>        <idCliente>8a818e495885ff1601588d95f37c2b2a</idCliente>        <nombreCliente>ESTEFANIA TRINIDAD MENDOZA MARTINEZ</nombreCliente>        <edad>25</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>4000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>8</ciclo>        <renovacion>true</renovacion>      </cliente>      <cliente>        <idCliente>8a818f8658d98c310158dae04c1b7230</idCliente>        <nombreCliente>GLORIA MARTINEZ FLORES</nombreCliente>        <edad>50</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>11000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>2</ciclo>        <renovacion>false</renovacion>      </cliente>      <cliente>        <idCliente>8a818e495885ff1601588d95ecd72a4b</idCliente>        <nombreCliente>ISABEL VENTURA GERVACIO</nombreCliente>        <edad>40</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>8000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>27</ciclo>        <renovacion>true</renovacion>      </cliente>      <cliente>        <idCliente>8a818e495885ff1601588d95f24f2b0a</idCliente>        <nombreCliente>ROSA MARTINEZ FLORES</nombreCliente>        <edad>48</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>14000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>29</ciclo>        <renovacion>true</renovacion>      </cliente>    </clientes>    <mensajes />    <id>VFMEYFQQ438446927</id>    <metodologia>GS AHORRO</metodologia>    <frecuenciaPagoNumero>2</frecuenciaPagoNumero>    <frecuenciaPagoUnidad>DAYS</frecuenciaPagoUnidad>    <frecuenciaPago />    <producto>GS_SI</producto>    <tipoCredito>P</tipoCredito>    <cicloGrupo>0</cicloGrupo>    <nombreGrupo>Valle de Chalco </nombreGrupo>    <montoGrupal>37000</montoGrupal>    <indiceLiquidez>0</indiceLiquidez>    <tasaInteres>60.5</tasaInteres>    <numeroIntegrantes>4</numeroIntegrantes>    <sucursal>107</sucursal>    <plazo>20</plazo>    <edad>0</edad>    <renovacion>false</renovacion>  </contratoValidador>  <customFields />  <valores /></Contenedor>");
		
		//validaRiesgo.validarGrupo("<Contenedor>  <fullDetails>false</fullDetails>  <headerRequest>    <idUsuario>avazqueza</idUsuario>    <fechaOperacion>2016-12-23</fechaOperacion>    <idOperacion>d8074582-ff72-4ed2-a064-dc59169ff14d</idOperacion>  </headerRequest>  <contratoValidador>    <clientes>      <cliente>        <idCliente>8a818e495885ff1601588d95f37c2b2a</idCliente>        <nombreCliente>ESTEFANIA TRINIDAD MENDOZA MARTINEZ</nombreCliente>        <edad>25</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>4000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>8</ciclo>        <renovacion>true</renovacion>      </cliente>      <cliente>        <idCliente>8a818f8658d98c310158dae04c1b7230</idCliente>        <nombreCliente>GLORIA MARTINEZ FLORES</nombreCliente>        <edad>50</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>11000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>2</ciclo>        <renovacion>false</renovacion>      </cliente>      <cliente>        <idCliente>8a818e495885ff1601588d95ecd72a4b</idCliente>        <nombreCliente>ISABEL VENTURA GERVACIO</nombreCliente>        <edad>40</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>8000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>27</ciclo>        <renovacion>true</renovacion>      </cliente>      <cliente>        <idCliente>8a818e495885ff1601588d95f24f2b0a</idCliente>        <nombreCliente>ROSA MARTINEZ FLORES</nombreCliente>        <edad>48</edad>        <numeroRetrasos>0</numeroRetrasos>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>14000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>29</ciclo>        <renovacion>true</renovacion>      </cliente>    </clientes>    <mensajes />    <id>VFMEYFQQ438446927</id>    <metodologia>UDE TRADICIONAL</metodologia>    <frecuenciaPagoNumero>2</frecuenciaPagoNumero>    <frecuenciaPagoUnidad>WEEKS</frecuenciaPagoUnidad>    <frecuenciaPago />    <producto>BC</producto>    <tipoCredito>P</tipoCredito>    <cicloGrupo>0</cicloGrupo>    <nombreGrupo>Valle de Chalco </nombreGrupo>    <montoGrupal>37000</montoGrupal>    <indiceLiquidez>0</indiceLiquidez>    <tasaInteres>10.5</tasaInteres>    <numeroIntegrantes>4</numeroIntegrantes>    <sucursal>107</sucursal>    <plazo>20</plazo>    <edad>0</edad>    <renovacion>false</renovacion> <tieneGracia>S</tieneGracia>  </contratoValidador>  <customFields />  <valores /></Contenedor>");
		
		//validaRiesgo.validarGrupo("<Contenedor><headerRequest><idUsuario>avazqueza</idUsuario><fechaOperacion>2017-01-27</fechaOperacion><idOperacion>20b081fd-9cf8-4301-8184-c35dc82bfdbd</idOperacion></headerRequest><contratoValidador><id>VFTMYRPJ895511777</id><metodologia>EDUCACIÓN</metodologia><frecuenciaPagoUnidad>MONTHS</frecuenciaPagoUnidad><frecuenciaPago>ME</frecuenciaPago><producto>EDUCACION</producto><tipoCredito>A</tipoCredito><montoGrupal>5000.0</montoGrupal><razonOtorgamiento>0.0</razonOtorgamiento><tasaInteres>55.0</tasaInteres><numeroIntegrantes>1</numeroIntegrantes><sucursal>111</sucursal><plazo>6</plazo><edad>0</edad><cicloGrupo>5</cicloGrupo><frecuenciaPagoNumero>1</frecuenciaPagoNumero><tieneGracia>N</tieneGracia><renovacion>false</renovacion><clientes><cliente><idCliente>8a818f1f58010ed00158021d9ef804dd</idCliente><nombreCliente>ADRIANA GOMEZ FIERRO</nombreCliente><ciclo>5</ciclo><edad>42</edad><montoCreditoActual>20000.0</montoCreditoActual><montoSolicitado>5000.0</montoSolicitado><porcentajeMontoPrincipal>25.0</porcentajeMontoPrincipal><garantia>false</garantia><aval>false</aval><renovacion>true</renovacion></cliente></clientes><mensajes><mensaje><idIntegrante>VFTMYRPJ895511777</idIntegrante><descripcionMensaje>No cumple con el monto mínimo de crédito requerido</descripcionMensaje><tipoMensaje>011</tipoMensaje></mensaje></mensajes><codigoMensaje></codigoMensaje></contratoValidador><HeaderResponse><estatus>1</estatus><mensaje>Contrato Validado Correctamente</mensaje></HeaderResponse></Contenedor>");
		
		
		//validaRiesgo.validarGrupo("<Contenedor>  <fullDetails>false</fullDetails>  <headerRequest>    <idUsuario>avazqueza</idUsuario>    <fechaOperacion>2017-02-01</fechaOperacion>    <idOperacion>fb357fcd-327a-421a-bfa0-4007021094bd</idOperacion>  </headerRequest>  <contratoValidador>    <clientes>      <cliente>        <idCliente>8a818f1f58010ed00158021d74bb74b5</idCliente>        <idContrato>6304</idContrato>        <nombreCliente>MARIA CLARA LOPEZ JIMENEZ</nombreCliente>        <edad>40</edad>        <montoCreditoActual>6000</montoCreditoActual>        <montoSolicitado>5000</montoSolicitado>        <porcentajeMontoPrincipal>83.33333333333333333333333333</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>1</ciclo>        <renovacion>true</renovacion>        <idRegistro>0</idRegistro>        <idRegistroCabecero>0</idRegistroCabecero>      </cliente>    </clientes>    <mensajes />    <id>VFKMBPFB241256753</id>    <metodologia>CREDI-MUEBLE</metodologia>    <frecuenciaPagoNumero>1</frecuenciaPagoNumero>    <frecuenciaPagoUnidad>MONTHS</frecuenciaPagoUnidad>    <frecuenciaPago />    <producto>MUEBLE</producto>    <tipoCredito>A</tipoCredito>    <cicloGrupo>1</cicloGrupo>    <nombreGrupo>MARIA CLARA LOPEZ JIMENEZ</nombreGrupo>    <tieneGracia>N</tieneGracia>    <idGrupo>1164317</idGrupo>    <montoGrupal>5000</montoGrupal>    <indiceLiquidez>0</indiceLiquidez>    <tasaInteres>55</tasaInteres>    <numeroIntegrantes>1</numeroIntegrantes>    <sucursal>111</sucursal>    <plazo>9</plazo>    <renovacion>false</renovacion>  </contratoValidador>  <customFields />  <valores /></Contenedor>");
		
		//validaRiesgo.validarGrupo("<Contenedor>  <fullDetails>false</fullDetails>  <headerRequest>    <idUsuario>avazqueza</idUsuario>    <fechaOperacion>2017-02-01</fechaOperacion>    <idOperacion>fb357fcd-327a-421a-bfa0-4007021094bd</idOperacion>  </headerRequest>  <contratoValidador>    <clientes>      <cliente>        <idCliente>8a818f1f58010ed00158021d74bb74b5</idCliente>        <idContrato>6304</idContrato>        <nombreCliente>MARIA CLARA LOPEZ JIMENEZ</nombreCliente>        <edad>40</edad>        <montoCreditoActual>6000</montoCreditoActual>        <montoSolicitado>5000</montoSolicitado>        <porcentajeMontoPrincipal>83.33333333333333333333333333</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>1</ciclo>        <renovacion>true</renovacion>        <idRegistro>0</idRegistro>        <idRegistroCabecero>0</idRegistroCabecero>      </cliente>    </clientes>    <mensajes />    <id>VFKMBPFB241256753</id>    <metodologia>CREDI-MUEBLE</metodologia>    <frecuenciaPagoNumero>1</frecuenciaPagoNumero>    <frecuenciaPagoUnidad>MONTHS</frecuenciaPagoUnidad>    <frecuenciaPago />    <producto>MUEBLE</producto>    <tipoCredito>A</tipoCredito>    <cicloGrupo>1</cicloGrupo>    <nombreGrupo>MARIA CLARA LOPEZ JIMENEZ</nombreGrupo>    <tieneGracia>N</tieneGracia>    <idGrupo>1164317</idGrupo>    <montoGrupal>5000</montoGrupal>    <indiceLiquidez>0</indiceLiquidez>    <tasaInteres>55</tasaInteres>    <numeroIntegrantes>1</numeroIntegrantes>    <sucursal>111</sucursal>    <plazo>9</plazo>    <renovacion>false</renovacion>  </contratoValidador>  <customFields />  <valores /></Contenedor>");
		
		//validaRiesgo.validarGrupo("<Contenedor>  <fullDetails>false</fullDetails>  <headerRequest>    <idUsuario>avazqueza</idUsuario>    <fechaOperacion>2017-06-26</fechaOperacion>    <idOperacion>103fc85c-7768-464f-b2d9-4727e7175810</idOperacion>  </headerRequest>  <contratoValidador>    <clientes>      <cliente>        <idCliente>8a818e6558e4856f0158f2a1fbe74915</idCliente>        <idContrato>44347</idContrato>        <nombreCliente>MA DE LA LUZ ARELLANO ARAIZA</nombreCliente>        <edad>55</edad>        <montoCreditoActual>15000</montoCreditoActual>        <montoSolicitado>5000</montoSolicitado>        <porcentajeMontoPrincipal>33.333333333333333333333333333</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>3</ciclo>        <renovacion>true</renovacion>        <idRegistro>0</idRegistro>        <idRegistroCabecero>0</idRegistroCabecero>      </cliente>    </clientes>    <mensajes />    <id>VFRDRECA546569155</id>    <metodologia>EDUCACIÓN</metodologia>    <frecuenciaPagoNumero>1</frecuenciaPagoNumero>    <frecuenciaPagoUnidad>MONTHS</frecuenciaPagoUnidad>    <frecuenciaPago />    <producto>EDUCACION</producto>    <tipoCredito>A</tipoCredito>    <cicloGrupo>3</cicloGrupo>    <nombreGrupo>MA DE LA LUZ ARELLANO ARAIZA</nombreGrupo>    <tieneGracia>N</tieneGracia>    <idGrupo>1077049</idGrupo>    <montoGrupal>5000</montoGrupal>    <indiceLiquidez>0</indiceLiquidez>    <tasaInteres>55</tasaInteres>    <numeroIntegrantes>1</numeroIntegrantes>    <sucursal>107</sucursal>    <plazo>6</plazo>    <renovacion>false</renovacion>  </contratoValidador>  <customFields />  <valores /></Contenedor>");
		
		
		
		//************************************* VALIDAR BONIFICACIONES
		
		
		
		// BANCA COMUNAL - UDE TRADICIONAL
		/*
		validaRiesgo.validarBonificacion("<Contenedor>"
				+ "<bonificaciones>"
				+ "<bonificacion>"
				+ "<cicloCliente>1</cicloCliente>"
				+ "<cicloGrupo>1</cicloGrupo>"
				+ "<porcentajeCumplimientoAtraso>100</porcentajeCumplimientoAtraso>"
				+ "<porcentajeCumplimientoPlazo>60</porcentajeCumplimientoPlazo>"
				+ "<metodologia>UDE TRADICIONAL</metodologia>"
				+ "<producto>BANCA COMUNAL</producto>"
				+ "<tipoCredito>SAF</tipoCredito>"
				+ "<montoSolicitado>5000</montoSolicitado>"
				+ "<tipoCalculo></tipoCalculo>"
				+ "<fechaAprobada></fechaAprobada><fechaContrato>2017-04-11</fechaContrato><fechaGenerada></fechaGenerada><montoBonificacion></montoBonificacion><porcentajeBonificacion></porcentajeBonificacion><tasaInteres>55</tasaInteres><mensajes /><encodedKeyContrato>8a818f1f58010ed00158021d74bb74b5</encodedKeyContrato><estatus/><idCliente>101365</idCliente><idContrato>6304</idContrato><idCredito>VFAAAAAA123456789</idCredito><idGrupo>1164317</idGrupo><idRegistro>897</idRegistro><idRegistroJustificante>0</idRegistroJustificante></bonificacion></bonificaciones><customFields /><valores /><fullDetails>false</fullDetails><headerRequest><idUsuario>avazqueza</idUsuario><fechaOperacion>2017-04-11</fechaOperacion><idOperacion>fb357fcd-327a-421a-bfa0-4007021094bd</idOperacion></headerRequest></Contenedor>");
		*/
		
		
		
		// BANCA COMUNAL - UDE 2.0
		/*
		validaRiesgo.validarBonificacion("<Contenedor>"
				+ "<bonificaciones>"
				+ "<bonificacion>"
				+ "<cicloCliente>1</cicloCliente>"
				+ "<cicloGrupo>4</cicloGrupo>"
				+ "<porcentajeCumplimientoAtraso>100</porcentajeCumplimientoAtraso>"
				+ "<porcentajeCumplimientoPlazo>60</porcentajeCumplimientoPlazo>"
				+ "<metodologia>UDE 2.0</metodologia>"
				+ "<producto>BANCA COMUNAL</producto>"
				+ "<tipoCredito>SAF</tipoCredito>"
				+ "<montoSolicitado>1000</montoSolicitado>"
				+ "<interesPagado>2000</interesPagado>"
				+ "<tipoCalculo></tipoCalculo>"
				+ "<fechaAprobada></fechaAprobada><fechaContrato>2017-04-11</fechaContrato><fechaGenerada></fechaGenerada><montoBonificacion></montoBonificacion><porcentajeBonificacion></porcentajeBonificacion><tasaInteres>55</tasaInteres><mensajes /><encodedKeyContrato>8a818f1f58010ed00158021d74bb74b5</encodedKeyContrato><estatus/><idCliente>101365</idCliente><idContrato>6304</idContrato><idCredito>VFAAAAAA123456789</idCredito><idGrupo>1164317</idGrupo><idRegistro>897</idRegistro><idRegistroJustificante>0</idRegistroJustificante></bonificacion></bonificaciones><customFields /><valores /><fullDetails>false</fullDetails><headerRequest><idUsuario>avazqueza</idUsuario><fechaOperacion>2017-04-11</fechaOperacion><idOperacion>fb357fcd-327a-421a-bfa0-4007021094bd</idOperacion></headerRequest></Contenedor>");
		*/
		
		
		// INDIVIDUAL - INDIVIDUAL
		/*
		validaRiesgo.validarBonificacion("<Contenedor>"
				+ "<bonificaciones>"
				+ "<bonificacion>"
				+ "<cicloCliente>1</cicloCliente>"
				+ "<cicloGrupo>8</cicloGrupo>"
				+ "<porcentajeCumplimientoAtraso>50</porcentajeCumplimientoAtraso>"
				+ "<porcentajeCumplimientoPlazo>50</porcentajeCumplimientoPlazo>"
				+ "<metodologia>INDIVIDUAL</metodologia>"
				+ "<producto>INDIVIDUAL</producto>"
				+ "<tipoCredito>SAF</tipoCredito>"
				+ "<montoSolicitado>30000</montoSolicitado>"
				+ "<interesPagado>0000</interesPagado>"
				+ "<tipoCalculo></tipoCalculo>"
				+ "<porcentajeBonificacion>4</porcentajeBonificacion>"
				+ "<recalcular>S</recalcular>"
				+ "<fechaAprobada></fechaAprobada><fechaContrato>2017-04-11</fechaContrato><fechaGenerada></fechaGenerada><montoBonificacion></montoBonificacion><tasaInteres>55</tasaInteres><mensajes /><encodedKeyContrato>8a818f1f58010ed00158021d74bb74b5</encodedKeyContrato><estatus/><idCliente>101365</idCliente><idContrato>6304</idContrato><idCredito>VFAAAAAA123456789</idCredito><idGrupo>1164317</idGrupo><idRegistro>897</idRegistro><idRegistroJustificante>0</idRegistroJustificante></bonificacion></bonificaciones><customFields /><valores /><fullDetails>false</fullDetails><headerRequest><idUsuario>avazqueza</idUsuario><fechaOperacion>2017-04-11</fechaOperacion><idOperacion>fb357fcd-327a-421a-bfa0-4007021094bd</idOperacion></headerRequest></Contenedor>");
				*/
		

		
		
		// GRUPO SOLIDARIO (SI) - GRUPO SOLIDARIO TRADICIONAL
		/*
		validaRiesgo.validarBonificacion("<Contenedor>"
				+ "<bonificaciones>"
				+ "<bonificacion>"
				+ "<cicloCliente>1</cicloCliente>"
				+ "<cicloGrupo>8</cicloGrupo>"
				+ "<porcentajeCumplimientoAtraso>100</porcentajeCumplimientoAtraso>"
				+ "<porcentajeCumplimientoPlazo>50</porcentajeCumplimientoPlazo>"
				+ "<metodologia>GRUPO SOLIDARIO TRADICIONAL</metodologia>"
				+ "<producto>GRUPO SOLIDARIO (SI)</producto>"
				+ "<tipoCredito>SAF</tipoCredito>"
				+ "<montoSolicitado>1000</montoSolicitado>"
				+ "<tipoCalculo></tipoCalculo>"
				+ "<fechaAprobada></fechaAprobada><fechaContrato>2017-04-11</fechaContrato><fechaGenerada></fechaGenerada><montoBonificacion></montoBonificacion><porcentajeBonificacion></porcentajeBonificacion><tasaInteres>55</tasaInteres><mensajes /><encodedKeyContrato>8a818f1f58010ed00158021d74bb74b5</encodedKeyContrato><estatus/><idCliente>101365</idCliente><idContrato>6304</idContrato><idCredito>VFAAAAAA123456789</idCredito><idGrupo>1164317</idGrupo><idRegistro>897</idRegistro><idRegistroJustificante>0</idRegistroJustificante></bonificacion></bonificaciones><customFields /><valores /><fullDetails>false</fullDetails><headerRequest><idUsuario>avazqueza</idUsuario><fechaOperacion>2017-04-11</fechaOperacion><idOperacion>fb357fcd-327a-421a-bfa0-4007021094bd</idOperacion></headerRequest></Contenedor>");
		*/		
		
		
		
		
		/*	
		validaRiesgo.validarGrupo("<Contenedor>  "
				+ "	<fullDetails>false</fullDetails>  "
				+ "<headerRequest>    "
				+ "<idUsuario>avazqueza</idUsuario>    "
				+ "<fechaOperacion>2017-06-26</fechaOperacion>    "
				+ "<idOperacion>103fc85c-7768-464f-b2d9-4727e7175810</idOperacion>  "
				+ "</headerRequest>  "
				+ "<contratoValidador>    "
				+ "<clientes>      "
					+ "<cliente>        "
					+ "<idCliente>8a818fb069110771016911718670134c</idCliente>        "
					+ "<idContrato>241812</idContrato>        "
					+ "<nombreCliente>ANGELICA LETICIA SANCHEZ HERNANDEZ</nombreCliente>        "
					+ "<edad>29</edad>        "
					+ "<montoCreditoActual>0</montoCreditoActual>        "
					+ "<montoSolicitado>5000</montoSolicitado>        "
					+ "<porcentajeMontoPrincipal>33.333333333333333333333333333</porcentajeMontoPrincipal>        "
					+ "<garantia>false</garantia>        "
					+ "<aval>false</aval>        "
					+ "<ciclo>1</ciclo>        "
					+ "<renovacion>false</renovacion>        "
					+ "<idRegistro>0</idRegistro>        "
					+ "<idRegistroCabecero>0</idRegistroCabecero>      "
					+ "</cliente>    "
				+ "</clientes>    "
				+ "<mensajes />    "
				+ "<id>VFRDRECA546569155</id>    "
				+ "<metodologia>UDE 3.0</metodologia>    "
				+ "<frecuenciaPagoNumero>1</frecuenciaPagoNumero>    "
				+ "<frecuenciaPagoUnidad>WEEKS</frecuenciaPagoUnidad>    "
				+ "<frecuenciaPago />    "
				+ "<producto>BC</producto>    "
				+ "<tipoCredito>P</tipoCredito>    "
				+ "<cicloGrupo>0</cicloGrupo>    "
				+ "<nombreGrupo>MARIPOSITAS</nombreGrupo>    "
				+ "<tieneGracia>N</tieneGracia>    "
				+ "<idGrupo>1077049</idGrupo>    "
				+ "<montoGrupal>225000</montoGrupal>    "
				+ "<indiceLiquidez>0</indiceLiquidez>    "
				+ "<tasaInteres>45</tasaInteres>    "
				+ "<numeroIntegrantes>12</numeroIntegrantes>    "
				+ "<sucursal>107</sucursal>    "
				+ "<plazo>6</plazo>    "
				+ "<renovacion>false</renovacion>  "
				+ "</contratoValidador>  <customFields />  <valores /></Contenedor>");
		*/
		
		
		validaRiesgo.validarGrupo("<Contenedor><fullDetails>false</fullDetails>  <headerRequest>    <idUsuario>avazqueza</idUsuario>    <fechaOperacion>2020-06-21</fechaOperacion>    <idOperacion>e6e75999-e436-46d8-a10a-1e4e036c67f6</idOperacion>  </headerRequest>  <contratoValidador>    <clientes>      <cliente>        <idCliente>8a818f485b3adecd015b43a83c541484</idCliente>        <idContrato>352148</idContrato>        <nombreCliente>ADRIAN HERRERA ANDRADE</nombreCliente>        <edad>41</edad>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>10000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>7</ciclo>        <renovacion>false</renovacion>        <idRegistro>0</idRegistro>        <idRegistroCabecero>0</idRegistroCabecero>        <formaDesembolso>DIE</formaDesembolso>        <bancoDesembolso>BANAMEX</bancoDesembolso>        <titularCuenta />      </cliente>      <cliente>        <idCliente>8a818f485b3adecd015b4395a2570d5f</idCliente>        <idContrato>352144</idContrato>        <nombreCliente>ANEL CADENA PERALTA</nombreCliente>        <edad>22</edad>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>10000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>4</ciclo>        <renovacion>false</renovacion>        <idRegistro>0</idRegistro>        <idRegistroCabecero>0</idRegistroCabecero>        <formaDesembolso>TRANSFERENCIA INDIVIDUAL</formaDesembolso>        <bancoDesembolso>BANAMEX</bancoDesembolso>        <clabe>529768363914173211</clabe>        <banco>BANCO AZTECA</banco>        <clabeContrato>549562393957071911</clabeContrato>        <titularCuenta />      </cliente>      <cliente>        <idCliente>8a818f485b3adecd015b43e20e8146c1</idCliente>        <idContrato>352146</idContrato>        <nombreCliente>ELIZABETH MOLINA VAZQUEZ</nombreCliente>        <edad>51</edad>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>10000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>7</ciclo>        <renovacion>false</renovacion>        <idRegistro>0</idRegistro>        <idRegistroCabecero>0</idRegistroCabecero>        <formaDesembolso>DIE</formaDesembolso>        <bancoDesembolso>BANAMEX</bancoDesembolso>        <titularCuenta />      </cliente>      <cliente>        <idCliente>8a818f485b3adecd015b439d4f811008</idCliente>        <idContrato>352149</idContrato>        <nombreCliente>ISELA RIVERA ARANO</nombreCliente>        <edad>29</edad>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>10000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>7</ciclo>        <renovacion>false</renovacion>        <idRegistro>0</idRegistro>        <idRegistroCabecero>0</idRegistroCabecero>        <formaDesembolso>DIE</formaDesembolso>        <bancoDesembolso>BANAMEX</bancoDesembolso>        <titularCuenta />      </cliente>      <cliente>        <idCliente>8a818f485b3adecd015b4385fafd0740</idCliente>        <idContrato>352145</idContrato>        <nombreCliente>MARIA LUISA HIPOLITO BELTRAN</nombreCliente>        <edad>50</edad>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>10000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>6</ciclo>        <renovacion>false</renovacion>        <idRegistro>0</idRegistro>        <idRegistroCabecero>0</idRegistroCabecero>        <formaDesembolso>TRANSFERENCIA INDIVIDUAL</formaDesembolso>        <bancoDesembolso>BANAMEX</bancoDesembolso>        <clabe>551493906923251711</clabe>        <banco>BANCOPPEL</banco>        <clabeContrato>549562393957071911</clabeContrato>        <titularCuenta />      </cliente>      <cliente>        <idCliente>8a818f485b3adecd015b43e565da47c6</idCliente>        <idContrato>352147</idContrato>        <nombreCliente>TULIO GASTON GARCIA PAZ</nombreCliente>        <edad>46</edad>        <montoCreditoActual>0</montoCreditoActual>        <montoSolicitado>10000</montoSolicitado>        <porcentajeMontoPrincipal>0</porcentajeMontoPrincipal>        <garantia>false</garantia>        <aval>false</aval>        <ciclo>6</ciclo>        <renovacion>false</renovacion>        <idRegistro>0</idRegistro>        <idRegistroCabecero>0</idRegistroCabecero>        <formaDesembolso>DIE</formaDesembolso>        <bancoDesembolso>BANAMEX</bancoDesembolso>        <titularCuenta />      </cliente>    </clientes>    <mensajes />    <id>VFJGRCRR899996746</id>    <metodologia>UDE 3.0</metodologia>    <frecuenciaPagoNumero>1</frecuenciaPagoNumero>    <frecuenciaPagoUnidad>WEEKS</frecuenciaPagoUnidad>    <frecuenciaPago />    <producto>BC</producto>    <tipoCredito>P</tipoCredito>    <cicloGrupo>0</cicloGrupo>    <nombreGrupo>SAFIRO R-116</nombreGrupo>    <tieneGracia>N</tieneGracia>    <idGrupo>769088896</idGrupo>    <montoGrupal>60000</montoGrupal>    <indiceLiquidez>0</indiceLiquidez>    <tasaInteres>56</tasaInteres>    <numeroIntegrantes>6</numeroIntegrantes>    <sucursal>116</sucursal>    <plazo>16</plazo>    <renovacion>false</renovacion>    <diferenciaFechaAmortizacion>8</diferenciaFechaAmortizacion>  </contratoValidador>  <customFields />  <valores /></Contenedor>");
		}

}
