//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.28 at 02:10:08 PM EEST 
//


package com.nortal.telecom.smsgateway.model.sendsms;

import javax.annotation.Generated;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrationIdentifier"
})
@XmlRootElement(name = "getReceivedReport")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T02:10:08+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public class GetReceivedReport {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T02:10:08+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String registrationIdentifier;

    /**
     * Gets the value of the registrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T02:10:08+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getRegistrationIdentifier() {
        return registrationIdentifier;
    }

    /**
     * Sets the value of the registrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T02:10:08+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setRegistrationIdentifier(String value) {
        this.registrationIdentifier = value;
    }

}
