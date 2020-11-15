package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println("This is an exeption.");
        } finally {
            System.out.println("The end");
        }

        try {
            secondChallenge.probablyIWillThrowException(1, 1.4);
        } catch (Exception e) {
            System.out.println("This is not an exeption.");
        } finally {
            System.out.println("The end");
        }
    }
}
