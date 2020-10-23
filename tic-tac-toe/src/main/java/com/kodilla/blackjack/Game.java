package com.kodilla.blackjack;

public class Game {
    private Board board = new Board();
    private String whoMoves = "X";

    public void switchPlayer(){
        whoMoves = (whoMoves.equals("X")) ? "O" : "X";
    }
}
