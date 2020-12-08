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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (startAirports != null ? !startAirports.equals(flight.startAirports) : flight.startAirports != null)
            return false;
        return finalAirports != null ? finalAirports.equals(flight.finalAirports) : flight.finalAirports == null;
    }

    @Override
    public int hashCode() {
        int result = startAirports != null ? startAirports.hashCode() : 0;
        result = 31 * result + (finalAirports != null ? finalAirports.hashCode() : 0);
        return result;
    }
}