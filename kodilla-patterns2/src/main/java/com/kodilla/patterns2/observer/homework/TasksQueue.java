package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable {

    private final String name;
    private final List<Task> tasksList;
    private final List<Mentor> mentors;


    public TasksQueue(String name) {
        this.name = name;
        tasksList = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasksList() {
        return tasksList;
    }

    public void addTask(Task task) {
        tasksList.add(task);
    }

    @Override
    public void registerMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentors() {
        for (Mentor mentor : mentors) {
            mentor.updateTasks(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor) {
        mentors.remove(mentor);
    }
}
