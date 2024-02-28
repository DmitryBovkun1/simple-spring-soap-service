package com.demo.service;

import com.demo.arithmetic.ArithmeticRequest;
import com.demo.arithmetic.ArithmeticResponse;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticOperationService {

    public ArithmeticResponse calculate(ArithmeticRequest request) {
        int num1 = request.getNum1();
        int num2 = request.getNum2();
        String action = request.getAction();
        int result = 0;
        switch (action) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid action: " + action);
        }
        return new ArithmeticResponse(result);
    }
}