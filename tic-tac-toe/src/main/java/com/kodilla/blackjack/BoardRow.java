package com.kodilla.blackjack;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<String> cols = new ArrayList<>();

    public BoardRow() {
        for(int n = 0; n < 3; n++)
            cols.add(" ");
    }

    public List<String> getCols() {
        return cols;
    }
}
