import com.kodilla.blackjack.Game;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Gameflow {
    private final GridPane gridPane;
    private Game game;

    private Image cross1 = new Image("file:tic-tac-toe/src/main/resources/cross.png");
    private Image circle1 = new Image("file:tic-tac-toe/src/main/resources/circle.png");

    public Gameflow(GridPane gridPane, Game game) {
        this.gridPane = gridPane;
        this.game = game;
    }

    public void doClick(int col, int row) {
        game.move(col, row);
        if (!game.checkWinner().equals(" ")) {
            game.showWinner();
            game.checkWinner();
            game = new Game();
            displayOnBoard();
        }
        if (game.getBoard().noFreeSlots()) {
            game.showWinner();
            game = new Game();
            displayOnBoard();
        }
    }

    public void displayOnBoard() {
        gridPane.getChildren().clear();
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                ImageView imageView = null;
                if (game.getBoard().getFigure(col, row).equals("X")) {
                    imageView = new ImageView(cross1);
                } else if (game.getBoard().getFigure(col, row).equals("O")) {
                    imageView = new ImageView(circle1);
                }
                if (imageView != null) {
                    gridPane.add(imageView, col, row);
                }
            }
        }
    }
}
