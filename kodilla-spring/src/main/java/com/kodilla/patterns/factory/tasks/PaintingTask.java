package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean isExecuted) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
        return isExecuted;
    }
}


