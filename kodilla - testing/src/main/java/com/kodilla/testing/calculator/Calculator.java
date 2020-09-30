package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;
    private int sum = a + b;
    private int substraction = a - b;

    public int summing(int a, int b){
        return sum;
    }

    public int substracting(int a, int b){
        return substraction;
    }
}
