package com.kodilla.good.patterns.challenges.flights;


public class Application {
    public static void main(String[] args) {

        FindFlight findFlight = new FindFlight();

        System.out.println("These are all flights from Warszawa:");
        System.out.println(findFlight.findFlightsFrom("Warszawa"));

        System.out.println("These are all flights to Gdansk:");
        System.out.println(findFlight.findFlightsTo("Gdansk"));

        System.out.println("These are all flights from Gdansk to Warszawa through another city:");
        System.out.println(findFlight.findFlightFromToThrough("Gdansk", "Warszawa"));
    }
}