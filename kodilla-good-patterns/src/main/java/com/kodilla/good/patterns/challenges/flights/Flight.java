package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Flight {

    private String startAirports;
    private String indirectAirports;
    private String finalAirports;

    public Flight(String startAirports, String indirectAirports, String finalAirports) {
        this.startAirports = startAirports;
        this.indirectAirports = indirectAirports;
        this.finalAirports = finalAirports;
    }

    public String getStartAirports() {
        return startAirports;
    }

    public String getInDirectAirports() {
        return indirectAirports;
    }

    public String getFinalAirports() {
        return finalAirports;
    }
}