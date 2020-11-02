import com.kodilla.blackjack.Game;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private Image cross = new Image("file:src/main/resources/cross.png");
    private Image circle = new Image("file:src/main/resources/circle.png");

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, 600, 600, Color.CORAL);
        primaryStage.setScene(scene);

        primaryStage.setWidth(600);
        primaryStage.setHeight(600);

        GridPane gridPane = new GridPane();

        //  Utworzyć Grid Pane 3 na 3.
        // Ustawić row consstrains i column constrains grid pane na 200

        Game game = new Game();

        Gameflow gameFlow = new Gameflow(gridPane, game);

        gridPane.setOnMouseClicked(event -> {
            int x = (int) (event.getX()/200);
            int y = (int) (event.getY()/200);
            gameFlow.duclick(x, y);
            gameFlow.displayOnBoard();
        });

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();




    }
}
