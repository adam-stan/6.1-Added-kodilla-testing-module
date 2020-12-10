package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFlight {

    List<Flight> flights = new ArrayList<>();

    public FindFlight() {

        flights.add(new Flight("Warszawa", "Gdansk"));
        flights.add(new Flight("Warszawa", "Krakow"));
        flights.add(new Flight("Gdansk", "Warszawa"));
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Krakow", "Warszawa"));
        flights.add(new Flight("Lodz", "Warszawa"));
    }

    public List<Flight> findFlightsFrom(String interlineStartAirports) {
        return flights.stream()
                .filter(flight -> flight.getStartAirports().equals(interlineStartAirports))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String interlineFinalAirports) {
        return flights.stream()
                .filter(flight -> flight.getFinalAirports().equals(interlineFinalAirports))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightFromToThrough(String interlineStartAirports, String interlineFinalAirports) {
        List<Flight> result = new ArrayList<>();
        List<Flight> startFlight = findFlightsFrom(interlineStartAirports);
        List<Flight> finalFlight = findFlightsTo(interlineFinalAirports);


        for (Flight startF : startFlight) {
            for (Flight finalF : finalFlight) {
                // w if powinno być porównanie miasta końcowego z lotu startF z miastem początkowym lotu finalF
                if (startF.getFinalAirports().equals(finalF.getStartAirports())) {
                    result.add(startF);
                    result.add(finalF);
                }
            }
        }
        return result;
    }
}

























