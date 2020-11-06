package com.kodilla.stream.array;

public class Array {
    public static void main (String[] args) {

        int n;

        int numbers[] = new int[20];

        for(n = 0; n < numbers.length; n++) {
            numbers[n] = n;
            System.out.println("Array element: " + n + " = " + numbers[n]);

        }


    }
}
