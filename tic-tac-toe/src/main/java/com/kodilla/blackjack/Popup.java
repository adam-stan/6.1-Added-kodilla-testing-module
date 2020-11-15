package com.kodilla.blackjack;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Popup {

    public static void popup(String message){
        Stage window = new Stage();
        window.setMaxWidth(200);
        Label label = new Label();
        label.setText(message);
        Button button = new Button("Play again!");

        VBox layout = new VBox(10);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();



    }


}
