package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean isExecuted) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isExecuted = isExecuted;
    }

    @Override
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
