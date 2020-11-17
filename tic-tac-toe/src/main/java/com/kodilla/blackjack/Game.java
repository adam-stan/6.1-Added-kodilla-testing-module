package com.kodilla.blackjack;

public class Game {
    private Board board = new Board();
    private String whoMoves = "X";

    public void switchPlayer() {
        whoMoves = (whoMoves.equals("X")) ? "O" : "X";
    }

    public void move(int col, int row) {
        if (board.getFigure(col, row).equals(" ")) {
            board.setFigure(col, row, whoMoves);
            switchPlayer();
        }
    }

    public String checkWinner() {
        String result = " ";
        result = checkColumnsForWinner(result);
        result = checkRowsForWinner(result);
        result = checkDiagonalsForWinner(result);
        return result;
    }

    private String checkDiagonalsForWinner(String result) {
        if (!result.equals(" "))
            return result;

        String s = board.getFigure(0, 0) + board.getFigure(1, 1) + board.getFigure(2, 2);
        if (s.equals("XXX")) return "X";
        if (s.equals("OOO")) return "O";

        s = board.getFigure(0, 2) + board.getFigure(1, 1) + board.getFigure(2, 0);
        if (s.equals("XXX")) return "X";
        if (s.equals("OOO")) return "O";
        return " ";
    }

    private String checkRowsForWinner(String result) {
        if (!result.equals(" "))
            return result;
        for (int row = 0; row < 3; row++) {
            String s = board.getFigure(0, row) + board.getFigure(1, row) + board.getFigure(2, row);
            if (s.equals("XXX")) return "X";
            if (s.equals("OOO")) return "O";
        }
        return " ";
    }

    private String checkColumnsForWinner(String result) {
        if (!result.equals(" "))
            return result;
        for (int col = 0; col < 3; col++) {
            String s = board.getFigure(col, 0) + board.getFigure(col, 1) + board.getFigure(col, 2);
            if (s.equals("XXX")) return "X";
            if (s.equals("OOO")) return "O";
        }
        return " ";
    }

    public Board getBoard() {
        return board;
    }

    public void showWinner() {
        if (checkWinner().equals("X")) {
            Xwon xWon = new Xwon();
            xWon.show();
        }
        if (checkWinner().equals("O")) {
            Owon oWon = new Owon();
            oWon.show();
        }
        if (board.noFreeSlots() == true && (!checkWinner().equals("X")) && (!checkWinner().equals("O"))) {
            NoWinner noWinner = new NoWinner();
            noWinner.show();
        }
    }
}
