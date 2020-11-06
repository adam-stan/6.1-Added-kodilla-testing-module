package com.kodilla.stream.world;

import org.junit.Test;
import org.junit.Assert;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given

        Continent Europe = new Continent();
        Country Poland = new Country(new BigDecimal(38000000));
        Country Germany = new Country(new BigDecimal(80000000));
        Country Norway = new Country(new BigDecimal(10000000));
        Europe.addCountry(Poland);
        Europe.addCountry(Germany);
        Europe.addCountry(Norway);

        Continent Africa = new Continent();
        Country Egypt = new Country(new BigDecimal(5000000));
        Country Nigeria = new Country(new BigDecimal(80000000));
        Country Sudan = new Country(new BigDecimal(30000000));
        Africa.addCountry(Egypt);
        Africa.addCountry(Nigeria);
        Africa.addCountry(Sudan);

        Continent Asia = new Continent();
        Country China = new Country(new BigDecimal(1500000000));
        Country Russia = new Country(new BigDecimal(150000000));
        Country Turkey = new Country(new BigDecimal(100000000));
        Asia.addCountry(China);
        Asia.addCountry(Russia);
        Asia.addCountry(Turkey);

        World world = new World();
        world.addContinent(Europe);
        world.addContinent(Africa);
        world.addContinent(Asia);

        //When
        BigDecimal allPeople = world.getPeopleQuantinity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("1993000000");
        Assert.assertEquals(expectedPeople, allPeople);
    }
}