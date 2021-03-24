package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksQueueTestSuite {

    @Test
    public void testUpdate() {

        //Given

        Mentor jacekPlacek = new Mentor("Jacek Placek");
        Mentor grzegorzBraun = new Mentor("Grzegorz Braun");

        TasksQueue januszWujecTasks = new TasksQueue("januszWujecTasks");
        TasksQueue mariuszLeonTasks = new TasksQueue("mariuszLeonTasks");
        TasksQueue sadamHusajnTasks = new TasksQueue("sadamHusajnTasks");

        januszWujecTasks.registerMentor(jacekPlacek);
        mariuszLeonTasks.registerMentor(jacekPlacek);
        sadamHusajnTasks.registerMentor(grzegorzBraun);

        januszWujecTasks.addTask(new Task("1 task"));
        januszWujecTasks.addTask(new Task("2 task"));

        mariuszLeonTasks.addTask(new Task("3 task"));

        sadamHusajnTasks.addTask(new Task("4 task"));
        sadamHusajnTasks.addTask(new Task("5 task"));

        //Then
        assertEquals(3, jacekPlacek.getUpdateCount());
        assertEquals(2, grzegorzBraun.getUpdateCount());
    }
}
