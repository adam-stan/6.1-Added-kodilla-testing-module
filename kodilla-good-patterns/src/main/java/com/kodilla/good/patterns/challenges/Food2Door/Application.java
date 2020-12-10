package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        ProductOrderService productOrderService = new ProductOrderService(
                new MailInformationService(), new SaleServiceImpl(), new SaleRepositoryImpl());

        SaleRequest saleRequest = new SaleRequest(
                new Producent("ExtraFoodShop", "extraFoodShop.gmail.com"), LocalDateTime.now(),
                new Product("tomatoes", 5.0));

        SaleDto saleDto = productOrderService.process(saleRequest);
        System.out.println(saleDto);
    }
}