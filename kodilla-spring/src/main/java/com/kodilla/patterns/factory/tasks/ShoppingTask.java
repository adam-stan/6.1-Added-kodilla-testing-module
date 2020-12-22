package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    public String executeTask() {
        return "Ordering task: " + getTaskName();
    }

    public boolean isTaskExecuted() {
        ShoppingTask shoppingTask = new ShoppingTask(taskName, whatToBuy, quantity);
        String result = shoppingTask.executeTask();
        if (result.equals("Ordering task: " + getTaskName())) {
            return true;
        } else {
            return false;
        }
    }
}
