//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.28 at 04:22:56 PM EEST 
//


package com.nortal.telecom.smsgateway.model.sendsms;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingInformation", namespace = "http://www.csapi.org/schema/parlayx/common/v2_0", propOrder = {
    "description",
    "currency",
    "amount",
    "code"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public class ChargingInformation {

    @XmlElement(namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String description;
    @XmlElement(namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String currency;
    @XmlElement(namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected BigDecimal amount;
    @XmlElement(namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String code;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setCode(String value) {
        this.code = value;
    }

}
