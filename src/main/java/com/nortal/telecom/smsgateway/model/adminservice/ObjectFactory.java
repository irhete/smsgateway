//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.30 at 12:32:18 PM EEST 
//


package com.nortal.telecom.smsgateway.model.adminservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortal.telecom.smsgateway.model.adminservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AdminService_QNAME = new QName("http://xml.apache.org/axis/wsdd/", "AdminService");
    private final static QName _AdminServiceReturn_QNAME = new QName("http://xml.apache.org/axis/wsdd/", "AdminServiceReturn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortal.telecom.smsgateway.model.adminservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.apache.org/axis/wsdd/", name = "AdminService")
    public JAXBElement<Object> createAdminService(Object value) {
        return new JAXBElement<Object>(_AdminService_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.apache.org/axis/wsdd/", name = "AdminServiceReturn")
    public JAXBElement<Object> createAdminServiceReturn(Object value) {
        return new JAXBElement<Object>(_AdminServiceReturn_QNAME, Object.class, null, value);
    }

}
