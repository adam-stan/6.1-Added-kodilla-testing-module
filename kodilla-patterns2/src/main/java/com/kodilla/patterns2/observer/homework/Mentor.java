package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void updateTasks(TasksQueue tasksQueue) {
        System.out.println(name + ": New task to check has been send from " + tasksQueue.getName() + "\n" +
                " (total: " + tasksQueue.getTasksList().size() + " tasks)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
