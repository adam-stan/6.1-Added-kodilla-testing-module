package com.kodilla.exception.test;

public class FlightSearchingRunner {
    public static void main(String[] args) {

        Flight flight = new Flight("Warsaw", "Krakow");
        FlightSearching flightSearching = new FlightSearching();
        try {
            flightSearching.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("There's no airport");
        }
    }
}
