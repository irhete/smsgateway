//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.30 at 04:45:28 PM EEST 
//


package com.nortal.telecom.smsgateway.model.sendsms;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variables" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceException", namespace = "http://www.csapi.org/schema/parlayx/common/v2_0", propOrder = {
    "messageId",
    "text",
    "variables"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public class ServiceException {

    @XmlElement(namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String messageId;
    @XmlElement(namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String text;
    @XmlElement(namespace = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected List<String> variables;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public List<String> getVariables() {
        if (variables == null) {
            variables = new ArrayList<String>();
        }
        return this.variables;
    }

}
