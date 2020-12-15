package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void creatingLog() {
        logger = Logger.INSTANCE;
        logger.log("This is a log.");
    }

    @Test
    public void getLastLog() {
        //Given
        //When
        String logName = logger.getLastLog();
        System.out.println("Last log is: " + logName);

        //Then
        assertEquals("This is a log.", logName);
    }
}
