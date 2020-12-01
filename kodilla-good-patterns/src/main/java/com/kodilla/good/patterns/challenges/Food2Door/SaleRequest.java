package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class SaleRequest {

    private Producent producent;
    private LocalDateTime date;
    private Product product;

    public SaleRequest(Producent producent, LocalDateTime date, Product product) {
        this.producent = producent;
        this.date = date;
        this.product = product;
    }

    public Producent getProducent() {
        return producent;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }
}