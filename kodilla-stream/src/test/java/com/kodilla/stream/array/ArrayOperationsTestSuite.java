package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int numbers[] = new int[20];
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 10;
        numbers[4] = 15;
        numbers[5] = 20;
        numbers[6] = 10;
        numbers[7] = 15;
        numbers[8] = 20;
        numbers[9] = 10;
        numbers[10] = 15;
        numbers[11] = 20;
        numbers[12] = 10;
        numbers[13] = 15;
        numbers[14] = 20;
        numbers[15] = 10;
        numbers[16] = 15;
        numbers[17] = 20;
        numbers[18] = 10;
        numbers[19] = 15;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(14.75, average);
        System.out.println(average);
    }

    @Test
    public void testGetAverage101520() {

        //Given
        int numbers[] = new int[3];
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(15, average);
        System.out.println(average);
    }

    @Test
    public void testWhyNotWork() {

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



