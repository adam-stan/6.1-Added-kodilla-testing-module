package com.kodilla.exception.io;


import com.kodilla.exception.test.SecondChallenge;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    public void testSecondChallenge() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 0));
    }

    @Test
    public void testSecondChallenge2() {

        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 100));
    }
    @Test
    public void testSecondChallenge3() {

        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.4));
    }
}
