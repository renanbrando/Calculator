package com.gmail.reebrando.calculator.Util;

/**
 * Created by logonrm on 10/07/2017.
 */

public class Calculator {

    private double numOne;
    private double numTwo;

    public Calculator(){
        this.numOne = 0;
        this.numTwo = 0;
    }

    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }

    public double calculate(String operation){
        double result = 0;

        switch (operation){
            case "+":
                result = this.numOne + this.numTwo;
                break;
            case "-":
                result = this.numOne - this.numTwo;
                break;
            case "x":
                result = this.numOne * this.numTwo;
                break;
            case "/":
                result = this.numOne / this.numTwo;
                break;
            default:
                //error
                break;
        }
        return result;
    }
}
