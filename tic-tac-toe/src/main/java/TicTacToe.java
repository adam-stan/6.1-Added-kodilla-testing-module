import com.kodilla.blackjack.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.awt.*;

public class TicTacToe extends Application {

    private Image cross = new Image("file:src/main/resources/cross.png");
    private Image circle = new Image("file:src/main/resources/circle.png");
    private Image noWinnerImage = new Image("file:src/main/resources/noWinner.png");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setWidth(600);
        primaryStage.setHeight(600);

        GridPane gridPane = new GridPane();

        for(int n = 0; n < 3; n++){
            gridPane.getColumnConstraints().add(new ColumnConstraints(188));
            gridPane.getRowConstraints().add(new RowConstraints(188));
        }

        Game game = new Game();
        Gameflow gameFlow = new Gameflow(gridPane, game);

        gridPane.setOnMouseClicked(event -> {
            int x = (int) (event.getX()/200);
            int y = (int) (event.getY()/200);
            gameFlow.doClick(x, y);
            gameFlow.displayOnBoard();
        });

        Scene scene = new Scene(gridPane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();

    }
}
