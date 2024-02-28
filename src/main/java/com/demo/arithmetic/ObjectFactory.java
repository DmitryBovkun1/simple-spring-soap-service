package com.demo.arithmetic;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {
    }
    public ArithmeticRequest createCustomerRequest() {
        return new ArithmeticRequest();
    }
    public ArithmeticResponse createAcknowledgement() {
        return new ArithmeticResponse();
    }
}
