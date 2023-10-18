package com.pruebaseti.prueba.xmls;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PedidoXML {

	private String Pedido;
    private String Cantidad;
    private String EAN;
    private String Producto;
    private String Cedula;
    private String Direccion;
    
	public String getPedido() {
		return Pedido;
	}
	public void setPedido(String pedido) {
		Pedido = pedido;
	}
	public String getCantidad() {
		return Cantidad;
	}
	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
	public String getEAN() {
		return EAN;
	}
	public void setEAN(String eAN) {
		EAN = eAN;
	}
	public String getProducto() {
		return Producto;
	}
	public void setProducto(String producto) {
		Producto = producto;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}	
}
