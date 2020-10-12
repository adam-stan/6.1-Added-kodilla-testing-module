package com.kodilla.testing.shape;

import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding figures")
    class AddingFigures {
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Triangle(4, 2));
            //When
            Shape shape = new Triangle(4, 2);
            boolean result = collector.getShapes().contains(shape);
            //Then
            Assert.assertTrue(result);
        }
    }

    @Nested
    @DisplayName("Tests for removing figures")
    class RemovingFigures {
        @Test
        public void testRemoveFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            //When
            boolean result = collector.removeFigure(new Circle(5));
            //Then
            Assert.assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Tests for getting figures")
    class GettingFigures {
        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape = new Square(5);
            collector.addFigure(shape);
            //When
            Shape retrievedShape = collector.getFigure(0);
            //Then
            Assert.assertEquals(shape, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Tests for showing figures")
    class ShowingFigures {
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Triangle(4, 2));
            collector.addFigure(new Square(5));
            collector.addFigure(new Circle(5));
            //When
            String showFigures = collector.showFigures();
            //Then
            Assert.assertEquals("Triangle(4.0,2.0), field - 4.0; Square(5.0), field - 25.0; Circle(5.0), field - " + 78.5 + "; ", showFigures);
        }
    }
}




