package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public interface SaleService {
    boolean createSale(Producent producent, LocalDateTime date);

}
