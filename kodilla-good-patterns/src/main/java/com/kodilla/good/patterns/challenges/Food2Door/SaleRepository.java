package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public interface SaleRepository {
    boolean createSale(Producent producent, LocalDateTime date);
}
