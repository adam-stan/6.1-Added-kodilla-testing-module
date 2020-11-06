import com.kodilla.blackjack.Game;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Gameflow {
    private final GridPane gridPane;
    private final Game game;

    private Image cross1 = new Image("file:tic-tac-toe/src/main/resources/cross.png");
    private Image circle1 = new Image("file:tic-tac-toe/src/main/resources/circle.png");

    public Gameflow(GridPane gridPane, Game game) {
        this.gridPane = gridPane;
        this.game = game;
    }

    public void duclick(int col, int row) {
        game.move(col, row);
    }

    public void displayOnBoard() {
        gridPane.getChildren().clear();
        for(int col = 0; col < 3; col++){
            for(int row = 0; row < 3; row++) {
                ImageView imageView = null;
                if(game.getBoard().getFigure(col, row).equals("X")){

                    // wstawić odpowiednie obrazki w tych ifach do imageView
                    imageView = new ImageView(cross1);

                } else if(game.getBoard().getFigure(col, row).equals("O")) {
                    imageView = new ImageView(circle1);

                } else{

                }
                gridPane.add(imageView, col, row);

                // po tym jak zrobie te w komentarzach powinno się klikać ale nie będzie zwycięscy

            }
        }
    }
}
