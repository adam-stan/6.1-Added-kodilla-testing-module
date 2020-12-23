package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecuted;

    public DrivingTask(String taskName, String where, String using, boolean isExecuted) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isExecuted = isExecuted;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean executeTask() {
        System.out.println("Ordering task: " + getTaskName());
        return isExecuted = true;
    }

    public boolean isTaskExecuted() {
        if (isExecuted) {
            System.out.println("Task " + getTaskName() + " is executed.");
            return true;
        } else {
            System.out.println("Task " + getTaskName() + " is not executed.");
            return !isExecuted;
        }
    }
}
