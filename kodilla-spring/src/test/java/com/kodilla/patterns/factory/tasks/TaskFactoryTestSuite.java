package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.chooseTask(TaskFactory.SHOPPINGTASK);

        //Then
        assertEquals("Chemical products", shoppingTask.getTaskName());
        assertEquals("Ordering task: " + shoppingTask.getTaskName(), shoppingTask.executeTask());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testPaintingTaskTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.chooseTask(TaskFactory.PAINTINGTASK);

        //Then
        assertEquals("Paints", paintingTask.getTaskName());
        assertEquals("Ordering task: " + paintingTask.getTaskName(), paintingTask.executeTask());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testDrivingTaskTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.chooseTask(TaskFactory.DRIVINGTASK);

        //Then
        assertEquals("Go to the gym", drivingTask.getTaskName());
        assertEquals("Ordering task: " + drivingTask.getTaskName(), drivingTask.executeTask());
        assertTrue(drivingTask.isTaskExecuted());
    }
}
