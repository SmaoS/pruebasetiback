package com.pruebaseti.prueba.clientes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import com.pruebaseti.prueba.util.PedidoUtil;
import com.pruebaseti.prueba.xml.Body;
import com.pruebaseti.prueba.xml.Body.EnvioPedidoAcme;
import com.pruebaseti.prueba.xml.Body.EnvioPedidoAcme.EnvioPedidoRequest;
import com.pruebaseti.prueba.xml.Body.EnvioPedidoAcmeResponse.EnvioPedidoResponse;
import com.pruebaseti.prueba.xml.Envelope;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.MimeHeaders;
import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPMessage;

@Repository
public class PedidoCliente extends WebServiceGatewaySupport {
	
	
	@Autowired
	private WebServiceTemplate webServiceTemplate;
	
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
		
		String peticionXml = PedidoUtil.pedidoObjetoAXml(envelope);
		clienteEncabezado(envelope);
		
		JAXBElement<Envelope> respuesta = (JAXBElement<Envelope>) 
				webServiceTemplate.marshalSendAndReceive(
						ENDPOINT, envelope);
		
		
		
		Envelope consulta = respuesta.getValue();	
		
		return consulta.getBody().getEnvioPedidoAcmeResponse().getEnvioPedidoResponse();
		
	}
	
	@SuppressWarnings("unchecked")
	public EnvioPedidoResponse pedidoCliente2(EnvioPedidoRequest peticion) {
	    Envelope envelope = new Envelope();
	    Body body = new Body();
	    Body.EnvioPedidoAcme listaPedido = new Body.EnvioPedidoAcme();

	    List<EnvioPedidoRequest> listaDePedidos = listaPedido.getEnvioPedidoRequest();
	    listaDePedidos.add(peticion);
	    listaPedido.setEnvioPedidoRequest(listaDePedidos);	    
	    body.setEnvioPedidoAcme(listaPedido);
	    envelope.setBody(body);

	    // Configurar la cabecera "Content-Type" como "application/xml"
	    WebServiceMessageCallback requestCallback = message -> {
	        SaajSoapMessage soapMessage = (SaajSoapMessage) message;
	        MimeHeaders headers = soapMessage.getSaajMessage().getMimeHeaders();
	        headers.setHeader("Content-Type", "text/xml");
	    };

	    // Enviar la solicitud y recibir la respuesta
	    JAXBElement<Envelope> respuesta = (JAXBElement<Envelope>) webServiceTemplate.sendAndReceive(
	        ENDPOINT,
	        new WebServiceMessageCallback() {
	            public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
	                // Configurar la solicitud aquí
	                requestCallback.doWithMessage(message);
	            }
	        },
	        new WebServiceMessageExtractor<JAXBElement<Envelope>>() {
	            public JAXBElement<Envelope> extractData(WebServiceMessage message) throws IOException, TransformerException {
	                // Procesar la respuesta aquí
	                return (JAXBElement<Envelope>) webServiceTemplate.getUnmarshaller().unmarshal((Source) message);
	            }
	        }
	    );

	    Envelope consulta = respuesta.getValue();

	    return consulta.getBody().getEnvioPedidoAcmeResponse().getEnvioPedidoResponse();
	}
	
	
    
    
    public EnvioPedidoResponse pedidoClienteRequest(EnvioPedidoRequest peticion) throws JAXBException {
        // Crear una solicitud SOAP utilizando JAXB u otra técnica
    	
    	SoapActionCallback soapActionCallback = new SoapActionCallback("http://schemas.xmlsoap.org/soap/envelope/EnvioPedidoRequest");
    	
    	  JAXBContext context = JAXBContext.newInstance(EnvioPedidoRequest.class); // Reemplaza con la clase generada por JAXB

          // Crear un marshaller JAXB para convertir el objeto Java en XML
          Marshaller marshaller = context.createMarshaller();

          // Convertir el objeto Java en una cadena XML
          StringWriter xmlStringWriter = new StringWriter();
          marshaller.marshal(peticion, xmlStringWriter);

          // Obtener la cadena XML resultante
          String soapRequestXml = xmlStringWriter.toString();

        // Enviar la solicitud utilizando WebServiceTemplate
        EnvioPedidoResponse respuesta = (EnvioPedidoResponse) webServiceTemplate.marshalSendAndReceive(ENDPOINT, peticion, soapActionCallback);

        return respuesta;
    }
    
       
    
    public void clienteEncabezado(Envelope envelope) {
    	
    	try { 
	        URL url = new URL("https://run.mocky.io/v3/19217075-6d4e-4818-98bc-416d1feb7b84");
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setDoOutput(true);
//	        connection.setInstanceFollowRedirects(false);
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

	            int contentLength = is.available();
	            // Leer la respuesta en un objeto de la clase Body.EnvioPedidoAcmeResponse
	            
	            JAXBContext responseCtx = JAXBContext.newInstance(Envelope.class);
	            Unmarshaller unmarshaller = responseCtx.createUnmarshaller();
	            JAXBElement<Envelope> responseElement = (JAXBElement<Envelope>) unmarshaller.unmarshal(is);

	            // Obtener el objeto Envelope de JAXBElement
	            Envelope respuesta = responseElement.getValue();
	            

	            is.close();	            
	            
	        } else {
	            
	        }
      
	        connection.disconnect();
	    } catch(Exception e) {
	        throw new RuntimeException(e);
	    }
    }
    
    public void clienteEncabezado2(Envelope envelope) {
        try {
            URL url = new URL("https://run.mocky.io/v3/19217075-6d4e-4818-98bc-416d1feb7b84");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "text/xml");

            // Obtener el OutputStream para escribir la solicitud XML
            OutputStream os = connection.getOutputStream();
            
            // Crear un mensaje SOAP con el objeto Envelope
            SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
            SOAPBody soapBody = soapMessage.getSOAPBody();
            JAXBContext ctx = JAXBContext.newInstance(Envelope.class);
            ctx.createMarshaller().marshal(envelope, soapBody);

            // Enviar la solicitud
            soapMessage.writeTo(os);
            os.close();

            // Obtener la respuesta del servicio web
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Si la respuesta es exitosa (código HTTP 200 OK)
                InputStream is = connection.getInputStream();
                
                // Procesar la respuesta SOAP
                SOAPMessage responseSoapMessage = MessageFactory.newInstance().createMessage(null, is);
                SOAPBody responseSoapBody = responseSoapMessage.getSOAPBody();

                // Extraer el contenido de la respuesta SOAP (puede requerir manipulación adicional)
                String respuesta = responseSoapBody.getAttribute("Envelope");
                
                
                is.close();
            } else {
                // Manejar errores, por ejemplo, lanzar una excepción o registrar un mensaje de error
            }

            connection.disconnect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
	
}
