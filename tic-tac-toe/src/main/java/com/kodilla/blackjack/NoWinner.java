package com.kodilla.blackjack;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NoWinner extends Stage {

    public NoWinner() {
        super();
        this.setTitle("End of the Game");
        this.setResizable(false);
        this.initModality(Modality.APPLICATION_MODAL);

        BorderPane borderPaneOptionPane = new BorderPane();
        Label label = new Label();
        label.setText("There's no winner!");
        label.setTranslateY(-5);
        label.setScaleX(1.5);
        label.setScaleY(1.5);

        borderPaneOptionPane.setCenter(label);

        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> {
            this.hide();
        });

        borderPaneOptionPane.setPadding(new Insets(100));

        Scene s = new Scene(borderPaneOptionPane);
        this.setScene(s);
    }
}
