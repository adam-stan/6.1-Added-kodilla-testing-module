package simpleGame;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {

        int i = 0;
        int drawnNumber;
        int spokenNumber;

        Random randomNumber = new Random();

        drawnNumber = randomNumber.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess number from 1 to 10.");

        do {
            i++;
            System.out.println("Give a number");
            spokenNumber = scanner.nextInt();
            if (drawnNumber > spokenNumber) {
                System.out.println("My number is bigger");
            }
            if (drawnNumber < spokenNumber) {
                System.out.println("My number is lower");
            }
            } while (drawnNumber != spokenNumber);
            System.out.println("You've guessed in the " + i + "time.");
    }
}