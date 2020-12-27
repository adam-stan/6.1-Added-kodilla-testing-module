package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigmacTestSuite {

    @Test
    void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bun")
                .burgers(1)
                .sauce("Barbecue")
                .ingredient("Salad")
                .ingredient("Onion")
                .ingredient("Becon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
    }
}
