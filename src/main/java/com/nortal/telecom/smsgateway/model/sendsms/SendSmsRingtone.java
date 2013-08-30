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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="addresses" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="charging" type="{http://www.csapi.org/schema/parlayx/common/v2_0}ChargingInformation"/>
 *         &lt;element name="ringtone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smsFormat" type="{http://www.csapi.org/schema/parlayx/sms/v2_0}SmsFormat"/>
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
    "addresses",
    "senderName",
    "charging",
    "ringtone",
    "smsFormat"
})
@XmlRootElement(name = "sendSmsRingtone")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public class SendSmsRingtone {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected List<String> addresses;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String senderName;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected ChargingInformation charging;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String ringtone;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected SmsFormat smsFormat;

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
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
    public List<String> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<String>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the charging property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public ChargingInformation getCharging() {
        return charging;
    }

    /**
     * Sets the value of the charging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setCharging(ChargingInformation value) {
        this.charging = value;
    }

    /**
     * Gets the value of the ringtone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getRingtone() {
        return ringtone;
    }

    /**
     * Sets the value of the ringtone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setRingtone(String value) {
        this.ringtone = value;
    }

    /**
     * Gets the value of the smsFormat property.
     * 
     * @return
     *     possible object is
     *     {@link SmsFormat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public SmsFormat getSmsFormat() {
        return smsFormat;
    }

    /**
     * Sets the value of the smsFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsFormat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setSmsFormat(SmsFormat value) {
        this.smsFormat = value;
    }

}
