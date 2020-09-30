package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
import com.sun.source.util.SourcePositions;

import java.net.SocketOption;
import java.sql.SQLOutput;

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

        int sumingAB = calculate.summing(15, 10);
        int substractingAB = calculate.substracting(15, 10);

        if (sumingAB == 25 && substractingAB == 5) {
            System.out.println("Calculator test is correct");
        } else {
            System.out.println("Error");
        }
        System.out.println(sumingAB);
        System.out.println(substractingAB);
    }
}