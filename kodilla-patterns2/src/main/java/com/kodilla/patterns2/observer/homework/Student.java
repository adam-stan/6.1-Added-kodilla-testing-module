package com.kodilla.patterns2.observer.homework;

public class Student implements Observer {

    private final String name;
    private final TasksQueue tasksQueue;

    public Student(String name, TasksQueue tasksQueue) {
        this.name = name;
        this.tasksQueue = tasksQueue;
    }

    public void updateTasks(TasksQueue tasksQueue) {
       tasksQueue.getTasksList();
    }
}
