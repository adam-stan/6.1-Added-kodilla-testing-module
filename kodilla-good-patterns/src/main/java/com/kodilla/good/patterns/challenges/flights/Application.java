package com.kodilla.good.patterns.challenges.flights;


public class Application {
    public static void main(String[] args) {

        FindFlight findFlight = new FindFlight();

        System.out.println("These are all flights from Warszawa:");
        findFlight.findFlightsFrom("Warszawa");

        System.out.println("These are all flights to Gdansk:");
        findFlight.findFlightsTo("Gdansk");


        findFlight.findFlightFromToThrough("Gdansk", "Warszawa");

    }
}