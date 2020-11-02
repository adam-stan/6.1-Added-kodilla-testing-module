package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {

    private final Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantinity(){
        return continents.stream()
            .flatMap(continent -> continent.getCountries().stream())
            .map(country -> country.getPeopleQuantinity())
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
