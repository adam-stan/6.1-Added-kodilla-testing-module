package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int n;
        int numbers[] = new int[20];

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        for (n = 0; n < numbers.length; n++) {
            numbers[n] = n;
            assertEquals(9.5, average);
        }
        System.out.println(average);
    }
}
