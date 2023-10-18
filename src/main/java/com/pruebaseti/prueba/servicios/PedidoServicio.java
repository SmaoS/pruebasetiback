package com.pruebaseti.prueba.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaseti.prueba.clientes.PedidoCliente;
import com.pruebaseti.prueba.conversores.PedidoConversor;
import com.pruebaseti.prueba.dtos.PedidoDTO;
import com.pruebaseti.prueba.dtos.PedidoRespuestaDTO;

@Service
public class PedidoServicio {
	
	@Autowired
	private PedidoCliente cliente;
		
	@Autowired
	private PedidoConversor conversor;
	
	public PedidoRespuestaDTO pedido(PedidoDTO dto) {
	
//		try {
			return conversor.xmlADTO(cliente.pedidoCliente(conversor.dtoAXML(dto)));
//		} catch (JAXBException e) {			
//			e.printStackTrace();
//			return null;
//		}
		
	}
	
}
