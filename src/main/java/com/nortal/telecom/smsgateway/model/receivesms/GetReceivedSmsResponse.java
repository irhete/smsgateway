//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.30 at 04:45:28 PM EEST 
//


package com.nortal.telecom.smsgateway.model.receivesms;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="result" type="{http://www.csapi.org/schema/parlayx/sms/v2_0}SmsMessage" maxOccurs="unbounded"/>
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
    "result"
})
@XmlRootElement(name = "getReceivedSmsResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public class GetReceivedSmsResponse {

    @XmlElement(namespace = "http://www.csapi.org/schema/parlayx/sms/receive/v2_0/local", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected List<SmsMessage> result;

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmsMessage }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-30T04:45:28+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public List<SmsMessage> getResult() {
        if (result == null) {
            result = new ArrayList<SmsMessage>();
        }
        return this.result;
    }

}
