package com.demo.endpoint;

import com.demo.service.ArithmeticOperationService;
import com.demo.arithmetic.ArithmeticRequest;
import com.demo.arithmetic.ArithmeticResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ArithmeticOperationsEndpoint {

    private static final String NAMESPACE = "http://demo.com/arithmetic";
    @Autowired
    private ArithmeticOperationService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "ArithmeticRequest")
    @ResponsePayload
    public ArithmeticResponse performArithmeticOperation(@RequestPayload ArithmeticRequest request) {
        return service.calculate(request);
    }
}
