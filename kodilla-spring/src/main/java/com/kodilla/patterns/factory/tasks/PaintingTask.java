package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    public String executeTask() {
        return "Ordering task: " + getTaskName();
    }

    public boolean isTaskExecuted() {
        PaintingTask paintingTask = new PaintingTask(taskName, color, whatToPaint);
        String result = paintingTask.executeTask();
        if (result.equals("Ordering task: " + getTaskName())) {
            return true;
        } else {
            return false;
        }
    }
}


