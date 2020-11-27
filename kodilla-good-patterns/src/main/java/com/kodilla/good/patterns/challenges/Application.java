package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        User user = new User("Adam");

        LocalDateTime date = LocalDateTime.of(2020, 11, 27, 18, 10);

        ProductOrderService productOrderService = new ProductOrderService();



    }
}
