package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void DoubleCheeseDecoratorTest() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);

        //When
        BigDecimal getCost = pizzaOrder.getCost();
        String getDescription = pizzaOrder.getDescription();

        //Then
        assertEquals(new BigDecimal(19), getCost);
        assertEquals("Pizza with tomato sauce, cheese + extra cheese", getDescription);
    }

    @Test
    public void PizzaDecoratorTest() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new TomatoesDecorator(pizzaOrder);

        //When
        BigDecimal getCost = pizzaOrder.getCost();
        String getDescription = pizzaOrder.getDescription();

        //Then
        assertEquals(new BigDecimal(25), getCost);
        assertEquals("Pizza with tomato sauce, cheese + salami + onion + tomatoes", getDescription);
    }

    @Test
    public void PizzaFullDecoratorTest() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new TomatoesDecorator(pizzaOrder);
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);

        //When
        BigDecimal getCost = pizzaOrder.getCost();
        String getDescription = pizzaOrder.getDescription();

        //Then
        assertEquals(new BigDecimal(33), getCost);
        assertEquals("Pizza with tomato sauce, cheese + salami + onion + tomatoes + extra cheese + ham", getDescription);
    }
}
