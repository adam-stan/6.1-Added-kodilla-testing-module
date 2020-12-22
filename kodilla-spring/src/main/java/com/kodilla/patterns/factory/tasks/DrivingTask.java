package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    public String executeTask() {
        return "Ordering task: " + getTaskName();
    }

    public boolean isTaskExecuted() {
        DrivingTask drivingTask = new DrivingTask(taskName, where, using);
        String result = drivingTask.executeTask();
        if (result.equals("Ordering task: " + getTaskName())) {
            return true;
        } else {
            return false;
        }
    }
}
