package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User Jakub = new YGeneration("Jakub Sobieski");
        User Heniek = new ZGeneration("Henryk Pawlaczyk");
        User Zenek = new Millenials("Zenon Danon");

        //When
        String Jakubprefers = Jakub.sharePost();
        System.out.println("Jakub says: " + Jakubprefers);
        String Heniekprefers = Heniek.sharePost();
        System.out.println("Heniek says: " + Heniekprefers);
        String Zenekprefers = Zenek.sharePost();
        System.out.println("Zenek says: " + Zenekprefers);

        //Then
        assertEquals("I'm using basically Twitter", Jakubprefers);
        assertEquals("I'm using basically Snapchat", Heniekprefers);
        assertEquals("I'm using basically Facebook", Zenekprefers);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User Jakub = new YGeneration("Jakub Sobieski");

        //When
        String Jakubprefers = Jakub.sharePost();
        System.out.println("Jakub says: " + Jakubprefers);
        Jakub.setMedia(new FacebookPublisher());
        Jakubprefers = Jakub.sharePost();
        System.out.println("Last time Jakub changed his preferances and now he says: " + Jakubprefers);

        //Then
        assertEquals("I'm using basically Facebook", Jakubprefers);
    }
}
