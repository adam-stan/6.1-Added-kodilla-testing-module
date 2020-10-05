package com.kodilla.testing.collection;
import java.util.ArrayList;
import org.junit.jupiter.api.*;

class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when we create emptyList, " +
            "then this emptyList should be equals to resultList"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> resultList = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Now we are testing EmptyList");
        //Then
        Assertions.assertEquals(emptyList, resultList);

    }

    @DisplayName("when we create evenAndUnevenNumbersList and call a method exterminate() on it" +
            "then this list should be equals to evenNumbersList."
    )
    @Test
    void testCaseUsername() {
        //Given
        ArrayList<Integer> evenAndUnevenNumbersList = new ArrayList<>();
        evenAndUnevenNumbersList.add(5);
        evenAndUnevenNumbersList.add(10);
        evenAndUnevenNumbersList.add(12);
        evenAndUnevenNumbersList.add(17);

        ArrayList<Integer>evenNumbersList = new ArrayList<>();
        evenNumbersList.add(10);
        evenNumbersList.add(12);

        //When
        ArrayList<Integer> resultList = OddNumbersExterminator.exterminate(evenAndUnevenNumbersList);
        System.out.println("Now we are testing evenAndUnevenNumbersList");

        //Then
        Assertions.assertEquals(evenNumbersList, resultList);
    }
}

