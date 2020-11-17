package com.kodilla.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for (int n = 0; n < 3; n++)
            rows.add(new BoardRow());
    }

    public String getFigure(int col, int row) {
        return rows.get(row).getCols().get(col);
    }

    public void setFigure(int col, int row, String figure) {
        rows.get(row).getCols().set(col, figure);
    }

    public boolean noFreeSlots() {
        boolean result = true;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (getFigure(col, row).equals(" "))
                    result = false;
            }
        }
        return result;
    }
}
