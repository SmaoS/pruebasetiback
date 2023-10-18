package com.pruebaseti.prueba.util;

import java.io.StringWriter;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class PedidoUtil {
	
	public static String pedidoObjetoAXml(Object object) {
		
		try {
		JAXBContext contextObj = JAXBContext.newInstance(object.getClass());  

		Marshaller marshallerObj = contextObj.createMarshaller();  
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 

		StringWriter sw = new StringWriter();
		marshallerObj.marshal(object, sw);  
		return sw.toString();		
		}catch (Exception e) {
			throw new IllegalStateException("Exception message");
		}
	}
	
}
