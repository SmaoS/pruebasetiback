package com.pruebaseti.prueba.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaseti.prueba.dtos.PedidoDTO;
import com.pruebaseti.prueba.dtos.PedidoRespuestaDTO;
import com.pruebaseti.prueba.servicios.PedidoServicio;

@RestController 
@RequestMapping("pedido")
public class PedidosControlador {
	
	@Autowired
	private PedidoServicio servicio;
	
	@PostMapping
    public PedidoRespuestaDTO Pedido(@RequestBody PedidoDTO dto) {	
		
        return servicio.pedido(dto);
    }

}
