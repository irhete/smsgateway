//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.28 at 04:28:44 PM EEST 
//


package com.nortal.telecom.smsgateway.model.sendsms;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senderAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="receiverAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="originMessageId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="deliveryStatus" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="originTimestamp" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportMessage", namespace = "http://sms.generated.server.soap.smsgw", propOrder = {
    "message",
    "senderAddress",
    "receiverAddress",
    "originMessageId",
    "deliveryStatus",
    "reasonCode",
    "originTimestamp"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public class ReportMessage {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String message;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String senderAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String receiverAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String originMessageId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String deliveryStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String reasonCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String originTimestamp;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setSenderAddress(String value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the receiverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Sets the value of the receiverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setReceiverAddress(String value) {
        this.receiverAddress = value;
    }

    /**
     * Gets the value of the originMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getOriginMessageId() {
        return originMessageId;
    }

    /**
     * Sets the value of the originMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setOriginMessageId(String value) {
        this.originMessageId = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setDeliveryStatus(String value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the originTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getOriginTimestamp() {
        return originTimestamp;
    }

    /**
     * Sets the value of the originTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:28:44+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setOriginTimestamp(String value) {
        this.originTimestamp = value;
    }

}
