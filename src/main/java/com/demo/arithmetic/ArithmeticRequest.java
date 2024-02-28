package com.demo.arithmetic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "num1",
        "num2",
        "action"
})
@XmlRootElement(name = "ArithmeticRequest")
public class ArithmeticRequest {
    private int num1;
    private int num2;
    private String action;

    public ArithmeticRequest() {
    }

    public ArithmeticRequest(int num1, int num2, String action) {
        this.num1 = num1;
        this.num2 = num2;
        this.action = action;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
