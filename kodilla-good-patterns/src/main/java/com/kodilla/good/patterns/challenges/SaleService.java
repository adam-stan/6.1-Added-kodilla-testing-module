package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface SaleService {
    boolean createSale(User user, LocalDateTime date);
}
