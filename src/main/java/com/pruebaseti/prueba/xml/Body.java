//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.18 a las 04:30:24 PM COT 
//


package com.pruebaseti.prueba.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import jakarta.xml.bind.annotation.XmlRootElement;


/**
 * <p>Clase Java para Body complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Body"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnvioPedidoAcme"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EnvioPedidoRequest" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="pedido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EnvioPedidoAcmeResponse"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EnvioPedidoResponse"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/", propOrder = {
    "envioPedidoAcme",
    "envioPedidoAcmeResponse"
})
@XmlRootElement
public class Body {

    @XmlElement(name = "EnvioPedidoAcme", required = true)
    protected Body.EnvioPedidoAcme envioPedidoAcme;
    @XmlElement(name = "EnvioPedidoAcmeResponse", required = true)
    protected Body.EnvioPedidoAcmeResponse envioPedidoAcmeResponse;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad envioPedidoAcme.
     * 
     * @return
     *     possible object is
     *     {@link Body.EnvioPedidoAcme }
     *     
     */
    public Body.EnvioPedidoAcme getEnvioPedidoAcme() {
        return envioPedidoAcme;
    }

    /**
     * Define el valor de la propiedad envioPedidoAcme.
     * 
     * @param value
     *     allowed object is
     *     {@link Body.EnvioPedidoAcme }
     *     
     */
    public void setEnvioPedidoAcme(Body.EnvioPedidoAcme value) {
        this.envioPedidoAcme = value;
    }

    /**
     * Obtiene el valor de la propiedad envioPedidoAcmeResponse.
     * 
     * @return
     *     possible object is
     *     {@link Body.EnvioPedidoAcmeResponse }
     *     
     */
    public Body.EnvioPedidoAcmeResponse getEnvioPedidoAcmeResponse() {
        return envioPedidoAcmeResponse;
    }

    /**
     * Define el valor de la propiedad envioPedidoAcmeResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link Body.EnvioPedidoAcmeResponse }
     *     
     */
    public void setEnvioPedidoAcmeResponse(Body.EnvioPedidoAcmeResponse value) {
        this.envioPedidoAcmeResponse = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="EnvioPedidoRequest" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="pedido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "envioPedidoRequest"
    })
    @XmlRootElement
    public static class EnvioPedidoAcme {

        @XmlElement(name = "EnvioPedidoRequest", required = true)
        protected List<Body.EnvioPedidoAcme.EnvioPedidoRequest> envioPedidoRequest;

        /**
         * Gets the value of the envioPedidoRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the envioPedidoRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnvioPedidoRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Body.EnvioPedidoAcme.EnvioPedidoRequest }
         * 
         * 
         */
        public List<Body.EnvioPedidoAcme.EnvioPedidoRequest> getEnvioPedidoRequest() {
            if (envioPedidoRequest == null) {
                envioPedidoRequest = new ArrayList<Body.EnvioPedidoAcme.EnvioPedidoRequest>();
            }
            return this.envioPedidoRequest;
        }
        
        public void setEnvioPedidoRequest(List<Body.EnvioPedidoAcme.EnvioPedidoRequest> envioPedidoRequest) {            
            	this.envioPedidoRequest = envioPedidoRequest;
        }



        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="pedido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cantidad",
            "cedula",
            "direccion",
            "ean",
            "pedido",
            "producto"
        })
        @XmlRootElement
        public static class EnvioPedidoRequest {

            @XmlElement(required = true)
            protected String cantidad;
            @XmlElement(required = true)
            protected String cedula;
            @XmlElement(required = true)
            protected String direccion;
            @XmlElement(name = "EAN", required = true)
            protected String ean;
            @XmlElement(required = true)
            protected String pedido;
            @XmlElement(required = true)
            protected String producto;

            /**
             * Obtiene el valor de la propiedad cantidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCantidad(String value) {
                this.cantidad = value;
            }

            /**
             * Obtiene el valor de la propiedad cedula.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCedula() {
                return cedula;
            }

            /**
             * Define el valor de la propiedad cedula.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCedula(String value) {
                this.cedula = value;
            }

            /**
             * Obtiene el valor de la propiedad direccion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccion() {
                return direccion;
            }

            /**
             * Define el valor de la propiedad direccion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccion(String value) {
                this.direccion = value;
            }

            /**
             * Obtiene el valor de la propiedad ean.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEAN() {
                return ean;
            }

            /**
             * Define el valor de la propiedad ean.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEAN(String value) {
                this.ean = value;
            }

            /**
             * Obtiene el valor de la propiedad pedido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPedido() {
                return pedido;
            }

            /**
             * Define el valor de la propiedad pedido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPedido(String value) {
                this.pedido = value;
            }

            /**
             * Obtiene el valor de la propiedad producto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProducto() {
                return producto;
            }

            /**
             * Define el valor de la propiedad producto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProducto(String value) {
                this.producto = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="EnvioPedidoResponse"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "envioPedidoResponse"
    })
    @XmlRootElement
    public static class EnvioPedidoAcmeResponse {

        @XmlElement(name = "EnvioPedidoResponse", required = true)
        protected Body.EnvioPedidoAcmeResponse.EnvioPedidoResponse envioPedidoResponse;

        /**
         * Obtiene el valor de la propiedad envioPedidoResponse.
         * 
         * @return
         *     possible object is
         *     {@link Body.EnvioPedidoAcmeResponse.EnvioPedidoResponse }
         *     
         */
        public Body.EnvioPedidoAcmeResponse.EnvioPedidoResponse getEnvioPedidoResponse() {
            return envioPedidoResponse;
        }

        /**
         * Define el valor de la propiedad envioPedidoResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link Body.EnvioPedidoAcmeResponse.EnvioPedidoResponse }
         *     
         */
        public void setEnvioPedidoResponse(Body.EnvioPedidoAcmeResponse.EnvioPedidoResponse value) {
            this.envioPedidoResponse = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "codigo",
            "mensaje"
        })
        public static class EnvioPedidoResponse {

            @XmlElement(name = "Codigo", required = true)
            protected String codigo;
            @XmlElement(name = "Mensaje", required = true)
            protected String mensaje;

            /**
             * Obtiene el valor de la propiedad codigo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * Define el valor de la propiedad codigo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

            /**
             * Obtiene el valor de la propiedad mensaje.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMensaje() {
                return mensaje;
            }

            /**
             * Define el valor de la propiedad mensaje.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMensaje(String value) {
                this.mensaje = value;
            }

        }

    }

}
