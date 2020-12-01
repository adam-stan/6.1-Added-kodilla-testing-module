package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class Airports {
    public static void main(String[] args) {

        List<String> startAirports = new ArrayList<>();

        startAirports.add("Gdansk");
        startAirports.add("Warszawa");
        startAirports.add("Lodz");
        startAirports.add("Krakow");
        startAirports.add("Wroclaw");


        List<String> indirectAirport = new ArrayList<>();

        indirectAirport.add("Lodz");
        indirectAirport.add("Warszawa");
        indirectAirport.add("Krakow");
        indirectAirport.add(" ");


        List<String> finalAirports = new ArrayList<>();

        finalAirports.add("Gdansk");
        startAirports.add("Warszawa");
        startAirports.add("Lodz");
        startAirports.add("Krakow");
        startAirports.add("Wroclaw");

    }
}