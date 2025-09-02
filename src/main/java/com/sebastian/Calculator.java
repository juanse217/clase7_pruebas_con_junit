package com.sebastian;

public class Calculator {
    
    public int sum(int a, int b){
        return a + b;
    }

    public int substraction(int a, int b){
        return a - b; 
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public int division(int a, int b){
        if(b == 0){
            throw new ArithmeticException("The divisor can't be 0");
        }
        return  a / b;
    }
}
