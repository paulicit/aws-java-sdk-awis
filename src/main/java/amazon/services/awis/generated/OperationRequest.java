//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.26 at 01:55:20 PM PDT 
//


package amazon.services.awis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://alexa.amazonaws.com/doc/2005-10-05/}HTTPHeaders" minOccurs="0"/&gt;
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://alexa.amazonaws.com/doc/2005-10-05/}Arguments" minOccurs="0"/&gt;
 *         &lt;element ref="{http://alexa.amazonaws.com/doc/2005-10-05/}Errors" minOccurs="0"/&gt;
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
    "httpHeaders",
    "requestId",
    "arguments",
    "errors"
})
@XmlRootElement(name = "OperationRequest")
public class OperationRequest {

    @XmlElement(name = "HTTPHeaders")
    protected HTTPHeaders httpHeaders;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "Arguments")
    protected Arguments arguments;
    @XmlElement(name = "Errors")
    protected Errors errors;

    /**
     * Gets the value of the httpHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPHeaders }
     *     
     */
    public HTTPHeaders getHTTPHeaders() {
        return httpHeaders;
    }

    /**
     * Sets the value of the httpHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPHeaders }
     *     
     */
    public void setHTTPHeaders(HTTPHeaders value) {
        this.httpHeaders = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link Arguments }
     *     
     */
    public Arguments getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Arguments }
     *     
     */
    public void setArguments(Arguments value) {
        this.arguments = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

}
