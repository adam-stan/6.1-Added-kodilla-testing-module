package com.kodilla.good.patterns.challenges.Food2Door;

public class Producent {
    private String name;
    private String mail;

    public Producent(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Producent{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
