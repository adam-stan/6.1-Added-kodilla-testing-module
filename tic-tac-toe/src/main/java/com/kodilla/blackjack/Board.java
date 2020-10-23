package com.kodilla.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for(int n = 0; n < 3; n++)
            rows.add(new BoardRow());
    }
    public String getFigure(int col, int row){
        return rows.get(row).getCols().get(col);
    }
    public void setFigure(int col, int row, String figure){
        rows.get(row).getCols().set(col, figure);
    }
}
