package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculationsAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double adding = calculator.add(1, 1);

        //Then
        assertEquals(2, adding);
    }

    @Test
    void testCalculationsSub() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double substring = calculator.sub(1, 1);

        //Then
        assertEquals(0, substring);
    }

    @Test
    void testCalculationsMul() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double multiply = calculator.mul(2, 2);

        //Then
        assertEquals(4, multiply);
    }

    @Test
    void testCalculationsDiv() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double divine = calculator.div(1, 1);

        //Then
        assertEquals(1, divine);
    }

    @Test
    void contextLoads() {
    }
}
