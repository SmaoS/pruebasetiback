package com.pruebaseti.prueba.conversores;

import org.springframework.stereotype.Component;

import com.pruebaseti.prueba.dtos.PedidoDTO;
import com.pruebaseti.prueba.dtos.PedidoRespuestaDTO;
import com.pruebaseti.prueba.xml.Body;
import com.pruebaseti.prueba.xml.Body.EnvioPedidoAcme.EnvioPedidoRequest;
import com.pruebaseti.prueba.xml.Body.EnvioPedidoAcmeResponse.EnvioPedidoResponse;

@Component
public class PedidoConversor {

	public EnvioPedidoRequest dtoAXML(PedidoDTO dto) {
		
		Body.EnvioPedidoAcme.EnvioPedidoRequest xml = new Body.EnvioPedidoAcme.EnvioPedidoRequest();
		
		xml.setPedido(dto.getNumPedido());
		xml.setCantidad(dto.getCantidadPedido());
		xml.setEAN(dto.getCodigoEAN());
		xml.setDireccion(dto.getDireccion());
		xml.setProducto(dto.getNumDocumento());
		xml.setCedula(dto.getNumDocumento());
		
		return xml;
	}
	
	public PedidoRespuestaDTO xmlADTO(EnvioPedidoResponse xml) {
		
		PedidoRespuestaDTO dto = new PedidoRespuestaDTO();
		
		dto.setEstado(xml.getMensaje());
		dto.setCodigoEnvio(xml.getCodigo());
		
		return dto;
		
	}
	
}
