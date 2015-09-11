//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.10 at 11:19:43 PM PDT 
//


package net.distributary.tahseen.awis.generated;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Response"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://alexa.amazonaws.com/doc/2005-10-05/}OperationRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://alexa.amazonaws.com/doc/2005-10-05/}CategoryListingsResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://alexa.amazonaws.com/doc/2005-10-05/}ResponseStatus" minOccurs="0"/&gt;
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
    "response"
})
@XmlRootElement(name = "CategoryListingsResponse")
public class CategoryListingsResponse {

    @XmlElement(name = "Response", required = true)
    protected CategoryListingsResponse.Response response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryListingsResponse.Response }
     *     
     */
    public CategoryListingsResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryListingsResponse.Response }
     *     
     */
    public void setResponse(CategoryListingsResponse.Response value) {
        this.response = value;
    }


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
     *         &lt;element ref="{http://alexa.amazonaws.com/doc/2005-10-05/}OperationRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://alexa.amazonaws.com/doc/2005-10-05/}CategoryListingsResult" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://alexa.amazonaws.com/doc/2005-10-05/}ResponseStatus" minOccurs="0"/&gt;
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
        "operationRequest",
        "categoryListingsResult",
        "responseStatus"
    })
    public static class Response {

        @XmlElement(name = "OperationRequest")
        protected List<OperationRequest> operationRequest;
        @XmlElement(name = "CategoryListingsResult")
        protected List<CategoryListingsResult> categoryListingsResult;
        @XmlElement(name = "ResponseStatus")
        protected ResponseStatus responseStatus;

        /**
         * Gets the value of the operationRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperationRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationRequest }
         * 
         * 
         */
        public List<OperationRequest> getOperationRequest() {
            if (operationRequest == null) {
                operationRequest = new ArrayList<OperationRequest>();
            }
            return this.operationRequest;
        }

        /**
         * Gets the value of the categoryListingsResult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryListingsResult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategoryListingsResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CategoryListingsResult }
         * 
         * 
         */
        public List<CategoryListingsResult> getCategoryListingsResult() {
            if (categoryListingsResult == null) {
                categoryListingsResult = new ArrayList<CategoryListingsResult>();
            }
            return this.categoryListingsResult;
        }

        /**
         * Gets the value of the responseStatus property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseStatus }
         *     
         */
        public ResponseStatus getResponseStatus() {
            return responseStatus;
        }

        /**
         * Sets the value of the responseStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseStatus }
         *     
         */
        public void setResponseStatus(ResponseStatus value) {
            this.responseStatus = value;
        }

    }

}
