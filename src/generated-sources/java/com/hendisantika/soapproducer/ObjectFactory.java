//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.11 at 09:05:22 AM WIB 
//


package com.hendisantika.soapproducer;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.hendisantika.soapproducer package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hendisantika.soapproducer
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link GetUserDetailsRequest }
     */
    public GetUserDetailsRequest createGetUserDetailsRequest() {
        return new GetUserDetailsRequest();
    }

    /**
     * Create an instance of {@link Address }
     */
    public Address createAddress() {
        return new Address();
    }

}
