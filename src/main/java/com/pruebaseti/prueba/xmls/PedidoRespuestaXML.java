package com.pruebaseti.prueba.xmls;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PedidoRespuestaXML {

	private String Codigo;
	private String Mensaje;
	
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
		
}
