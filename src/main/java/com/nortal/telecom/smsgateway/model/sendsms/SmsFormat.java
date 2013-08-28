//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.28 at 04:22:56 PM EEST 
//


package com.nortal.telecom.smsgateway.model.sendsms;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmsFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmsFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ems"/>
 *     &lt;enumeration value="SmartMessaging"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmsFormat", namespace = "http://www.csapi.org/schema/parlayx/sms/v2_0")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-08-28T04:22:56+03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public enum SmsFormat {

    @XmlEnumValue("Ems")
    EMS("Ems"),
    @XmlEnumValue("SmartMessaging")
    SMART_MESSAGING("SmartMessaging");
    private final String value;

    SmsFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmsFormat fromValue(String v) {
        for (SmsFormat c: SmsFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
