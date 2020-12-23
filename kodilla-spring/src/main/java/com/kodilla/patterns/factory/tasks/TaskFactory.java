package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task chooseTask(final String chosenTask) {

        switch (chosenTask) {
            case SHOPPINGTASK:
                return new ShoppingTask("Chemical products", "Window cleaner, Floor soap", 1.0, true);
            case PAINTINGTASK:
                return new PaintingTask("Paints", "Red and yellow", "Picture", true);
            case DRIVINGTASK:
                return new DrivingTask("Go to the gym", "Illegal gym in the basement", "Audi A4", true);
            default:
                return null;
        }
    }
}
