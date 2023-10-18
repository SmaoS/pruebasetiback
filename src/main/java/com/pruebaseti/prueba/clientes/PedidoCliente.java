package com.pruebaseti.prueba.clientes;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.pruebaseti.prueba.util.PedidoUtil;
import com.pruebaseti.prueba.xml.Body;
import com.pruebaseti.prueba.xml.Body.EnvioPedidoAcme.EnvioPedidoRequest;
import com.pruebaseti.prueba.xml.Body.EnvioPedidoAcmeResponse.EnvioPedidoResponse;
import com.pruebaseti.prueba.xml.Envelope;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;

@Repository
public class PedidoCliente extends WebServiceGatewaySupport {
		
	// Crear una conexión a la URL del servicio web SOAP
	private static final String ENDPOINT = "https://run.mocky.io/v3/19217075-6d4e-4818-98bc-416d1feb7b84";
	
	@SuppressWarnings("unchecked")
	public EnvioPedidoResponse pedidoCliente(EnvioPedidoRequest peticion)  {
		Envelope envelope = new Envelope();
		Body body = new Body();
		Body.EnvioPedidoAcme listaPedido = new Body.EnvioPedidoAcme();
		
		 List<EnvioPedidoRequest> listaDePedidos = listaPedido.getEnvioPedidoRequest();
		 listaDePedidos.add(peticion);		 
		 listaPedido.setEnvioPedidoRequest(listaDePedidos);
		 body.setEnvioPedidoAcme(listaPedido);
		 envelope.setBody(body);		 
		// ver la peticion q se envia
		String peticionXml = PedidoUtil.pedidoObjetoAXml(envelope);
		return clienteEncabezado(envelope);		

		
	}
	

    public EnvioPedidoResponse clienteEncabezado(Envelope envelope) {
    	Envelope respuesta = new Envelope();
    	
    	try { 
	        URL url = new URL(ENDPOINT);
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setDoOutput(true);

	        connection.setRequestMethod("POST");
	        connection.setRequestProperty("Content-Type", "application/xml");

	        OutputStream os = connection.getOutputStream();
	        // Write your XML to the OutputStream (JAXB is used in this example)
	        
	        JAXBContext ctx = JAXBContext.newInstance(Envelope.class);
	        ctx.createMarshaller().marshal(envelope, os);	        
	        os.flush();
	        connection.getResponseCode();
	        int responseCode = connection.getResponseCode();
	        if (responseCode == HttpURLConnection.HTTP_OK) {
	            // Si la respuesta es exitosa (código HTTP 200 OK)
	            InputStream is = connection.getInputStream();
	            
	            JAXBContext responseCtx = JAXBContext.newInstance(Envelope.class);
	            Unmarshaller unmarshaller = responseCtx.createUnmarshaller();
	            JAXBElement<Envelope> responseElement = (JAXBElement<Envelope>) unmarshaller.unmarshal(is);

	            // Obtener el objeto Envelope de JAXBElement
	            respuesta = responseElement.getValue();
	            
	            is.close();
	        } else {
	        	throw new RuntimeException("error al consumir el servicio soap codigo respuesta:"+responseCode);
	        }
      
	        connection.disconnect();
	        return respuesta.getBody().getEnvioPedidoAcmeResponse().getEnvioPedidoResponse();
	    } catch(Exception e) {
	        throw new RuntimeException(e);
	    }
    }
   
	
}
