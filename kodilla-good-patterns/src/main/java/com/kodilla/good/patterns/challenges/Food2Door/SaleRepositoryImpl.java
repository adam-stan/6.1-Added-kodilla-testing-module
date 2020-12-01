package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class SaleRepositoryImpl implements SaleRepository {
    @Override
    public boolean createSale(Producent producent, LocalDateTime date) {
        return producent.getName().length() > 2;
    }
}
