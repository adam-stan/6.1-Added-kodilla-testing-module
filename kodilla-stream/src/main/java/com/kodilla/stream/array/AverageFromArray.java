package com.kodilla.stream.array;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class AverageFromArray {


    public int getAverage(int[] numbers) {

        IntStream actualNumber = IntStream.range(0, numbers.length)
                .sum()
                .average();
    }
}

