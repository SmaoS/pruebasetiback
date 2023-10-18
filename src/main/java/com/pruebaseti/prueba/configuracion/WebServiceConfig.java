package com.pruebaseti.prueba.configuracion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.pruebaseti.prueba.clientes.PedidoCliente;

@Configuration
public class WebServiceConfig {
	
	@Bean
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        // Configurar el marshaller y unmarshaller (en este caso, Jaxb2Marshaller)
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.pruebaseti.prueba.xml"); // Reemplaza con el paquete que contiene tus clases generadas desde XSD o WSDL
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        return webServiceTemplate;
    }

}
