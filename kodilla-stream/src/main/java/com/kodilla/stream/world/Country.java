package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final BigDecimal peopleQuantinity;

    public Country(BigDecimal peopleQuantinity) {
        this.peopleQuantinity = peopleQuantinity;
    }

    public BigDecimal getPeopleQuantinity() {
        return peopleQuantinity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return peopleQuantinity.equals(country.peopleQuantinity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peopleQuantinity);
    }
}

