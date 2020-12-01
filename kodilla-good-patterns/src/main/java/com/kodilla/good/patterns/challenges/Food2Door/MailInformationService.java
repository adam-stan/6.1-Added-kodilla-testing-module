package com.kodilla.good.patterns.challenges.Food2Door;

public class MailInformationService implements InformationService {

    @Override
    public void inform(Producent producent) {
        System.out.println("Informing: " + producent.getMail());
    }
}
