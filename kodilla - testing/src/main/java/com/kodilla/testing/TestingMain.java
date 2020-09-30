package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator calculate = new Calculator();
        Calculator sum = new Calculator();
        Calculator substraction = new Calculator();


        int sumingAB = calculate.summing(15, 10);
        int substractingAB = calculate.substract(15, 10);

        if (sum.equals(sumingAB)) {
            System.out.println("Suming test is correct");
        } else {
            System.out.println("Error");
        }


        if (substraction.equals(substractingAB)) {
            System.out.println("Substracting test is correct");
        } else {
            System.out.println("Error");
        }






    }
}