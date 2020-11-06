import com.kodilla.blackjack.Game;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class TicTacToe extends Application {

    private Image cross = new Image("file:src/main/resources/cross.png");
    private Image circle = new Image("file:src/main/resources/circle.png");

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {


        primaryStage.setWidth(600);
        primaryStage.setHeight(600);


        //  Utworzyć Grid Pane 3 na 3.
        // Ustawić row consstrains i column constrains grid pane na 200

        GridPane gridPane = new GridPane();
        // jak ustawić ile ma być kolumni wierszy, ale może ustawienie constraitów już to rozwiązuje

        for(int n = 0; n < 3; n++){
            gridPane.getColumnConstraints().add(new ColumnConstraints(200));
            gridPane.getRowConstraints().add(new RowConstraints(200));

        }

        Game game = new Game();

        Gameflow gameFlow = new Gameflow(gridPane, game);

        gridPane.setOnMouseClicked(event -> {
            int x = (int) (event.getX()/200);
            int y = (int) (event.getY()/200);
            gameFlow.duclick(x, y);
            gameFlow.displayOnBoard();
        });
        Scene scene = new Scene(gridPane, 600, 600, Color.CORAL);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();




    }
}
