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
        assertEquals(adding, 2);
    }

    @Test
    void testCalculationsSub() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double substring = calculator.sub(1, 1);

        //Then
        assertEquals(substring, 0);
    }

    @Test
    void testCalculationsMul() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double multiply = calculator.mul(2, 2);

        //Then
        assertEquals(multiply, 4);
    }

    @Test
    void testCalculationsDiv() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double divine = calculator.div(1, 1);

        //Then
        assertEquals(divine, 1);
    }

    @Test
    void contextLoads() {
    }
}
