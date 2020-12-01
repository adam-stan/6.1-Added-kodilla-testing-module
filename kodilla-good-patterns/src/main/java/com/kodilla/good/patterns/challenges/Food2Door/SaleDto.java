package com.kodilla.good.patterns.challenges.Food2Door;

public class SaleDto {
    public Producent producent;
    public boolean isSaled;

    public SaleDto(Producent producent, boolean isSaled) {
        this.producent = producent;
        this.isSaled = isSaled;
    }

    public Producent getProducent() {
        return producent;
    }

    public boolean isSaled() {
        return isSaled;
    }

    @Override
    public String toString() {
        return producent +
                ", isSaled=" + isSaled +
                '}';
    }
}
