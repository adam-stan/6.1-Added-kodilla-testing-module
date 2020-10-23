import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
        Scene scene = new Scene(stackPane, 400, 400, Color.CORAL);
        primaryStage.setScene(scene);

        primaryStage.setWidth(400);
        primaryStage.setHeight(400);




        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();


        String [][] area = new String[3][3];

        TicTacToe player1 = new TicTacToe();
        TicTacToe player2 = new TicTacToe();


    }
}
