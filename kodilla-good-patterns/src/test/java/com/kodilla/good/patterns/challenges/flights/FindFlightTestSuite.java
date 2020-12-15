package com.kodilla.good.patterns.challenges.flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindFlightTestSuite {

    @Test
    public void shouldFindFlightsFrom() {
        //Given
        FindFlight finder = new FindFlight();
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Lodz", "Gdansk"));
        expected.add(new Flight("Lodz", "Warszawa"));

        //When
        List<Flight> flights = finder.findFlightsFrom("Lodz");

        //Then
        Assertions.assertEquals(1, flights.size());
    }

    @Test
    public void shouldNotFindFlightsFrom() {
        //Given
        FindFlight finder = new FindFlight();

        //When
        List<Flight> flights = finder.findFlightsFrom("Berlin");

        //Then
        Assertions.assertTrue(flights.isEmpty());
    }

    @Test
    public void shouldFindFlightsTo() {
        //Given
        FindFlight finder = new FindFlight();
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Warszawa", "Krakow"));
        expected.add(new Flight("Gdansk", "Krakow"));

        //When
        List<Flight> flights = finder.findFlightsTo("Krakow");

        //Then
        Assertions.assertEquals(2, flights.size());
        Assertions.assertEquals(expected, flights);
    }

    @Test
    public void shouldNotFindFlightsTo() {
        //Given
        FindFlight finder = new FindFlight();

        //When
        List<Flight> flights = finder.findFlightsTo("Berlin");

        //Then
        Assertions.assertTrue(flights.isEmpty());
    }

    @Test
    public void shouldFindThrough() {
        //Given
        FindFlight finder = new FindFlight();
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Warszawa", "Gdansk"));
        expected.add(new Flight("Gdansk", "Krakow"));

        //When
        List<Flight> flights = finder.findFlightFromToThrough("Warszawa", "Krakow");

        //Then
        Assertions.assertEquals(2, flights.size());
        Assertions.assertEquals(expected, flights);
    }

    @Test
    public void shouldNotFindFlightsThrough() {
        //Given
        FindFlight finder = new FindFlight();

        //When
        List<Flight> flights = finder.findFlightFromToThrough("Berlin", "Warszawa");

        //Then
        Assertions.assertTrue(flights.isEmpty());
    }
}
