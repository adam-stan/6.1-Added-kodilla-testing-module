package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Flight {

    private String startAirports;
    private String finalAirports;

    public Flight(String startAirports, String finalAirports) {
        this.startAirports = startAirports;
        this.finalAirports = finalAirports;
    }

    public String getStartAirports() {
        return startAirports;
    }

    public String getFinalAirports() {
        return finalAirports;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startAirports='" + startAirports + '\'' +
                ", finalAirports='" + finalAirports + '\'' +
                '}';
    }
}