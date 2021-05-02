package com.kodilla.stream;

import java.util.function.Predicate;

public class PredicateTask {
    public static void main(String[] args) {
        Predicate<Integer> predicate = integer -> integer == 10;
        System.out.println(predicate.test(10));
    }
}
