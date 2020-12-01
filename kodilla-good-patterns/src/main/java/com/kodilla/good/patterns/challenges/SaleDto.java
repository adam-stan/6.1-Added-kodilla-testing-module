package com.kodilla.good.patterns.challenges;

public class SaleDto {
    public User user;
    public boolean isSaled;

    public SaleDto(User user, boolean isSaled) {
        this.user = user;
        this.isSaled = isSaled;
    }

    public User getUser() {
        return user;
    }

    public boolean isSaled() {
        return isSaled;
    }

    public String toString(){
        return user + " " + isSaled;
    }
}
