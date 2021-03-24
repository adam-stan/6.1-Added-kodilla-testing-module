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
        jacekPlacek.updateTasks(januszWujecTasks);

        januszWujecTasks.addTask(new Task("2 task"));
        jacekPlacek.updateTasks(januszWujecTasks);

        mariuszLeonTasks.addTask(new Task("3 task"));
        jacekPlacek.updateTasks(mariuszLeonTasks);

        mariuszLeonTasks.addTask(new Task("4 task"));
        grzegorzBraun.updateTasks(mariuszLeonTasks);

        sadamHusajnTasks.addTask(new Task("5 task"));
        grzegorzBraun.updateTasks(sadamHusajnTasks);

        //Then
        assertEquals(3, jacekPlacek.getUpdateCount());
        assertEquals(2, grzegorzBraun.getUpdateCount());
    }
}
