package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleServiceImpl implements SaleService{

    @Override
    public boolean createSale(User user, LocalDateTime date) {
        return user.getName().length() > 2;
    }
}
