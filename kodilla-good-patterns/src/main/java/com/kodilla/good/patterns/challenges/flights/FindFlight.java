package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFlight {

    List<Flight> flights = new ArrayList<>();

    public FindFlight(){

    flights.add(new Flight("Warszawa", "Gdansk"));
    flights.add(new Flight("Warszawa", "Lodz"));
    flights.add(new Flight("Warszawa", "Krakow"));
    flights.add(new Flight("Gdansk", "Warszawa"));
    flights.add(new Flight("Gdansk", "Krakow"));
    flights.add(new Flight("Krakow", "Warszawa"));
    flights.add(new Flight("Krakow", "Gdansk"));
    flights.add(new Flight("Lodz", "Gdansk"));
    flights.add(new Flight("Lodz", "Warszawa"));

    }

    // Pokaż wszystkie z Gdaska
    // 2. Usuń bezpośredni z Gdańska do Warszawy
    //  wziąć z tych lotów  z Gdańska  final airports szukać ich w startairports
    //

    public List<Flight> findFlightsFrom(String startAirports){
        return flights.stream()
                .filter(flight -> flight.getStartAirports().equals(startAirports))
                .collect(Collectors.toList());


    }

    public List<Flight> findFlightsTo(String finalAirports){
        return flights.stream()
                .filter(flight -> flight.getFinalAirports().equals(finalAirports))
                .collect(Collectors.toList());

    }

    public List<Flight> findFlightFromToThrough(String interlineStartAirports, String interlineFinalAirports){
                List<Flight> result = new ArrayList<>();
                List<Flight> startFlight = findFlightsFrom(interlineStartAirports);
                List<Flight> finalFlight = findFlightsTo(interlineFinalAirports);

                return result;



    }


}

























