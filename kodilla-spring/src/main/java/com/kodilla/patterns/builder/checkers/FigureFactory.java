package com.kodilla.patterns.builder.checkers;

import javax.print.DocFlavor;

public final class FigureFactory {

    public static String PAWN = "PAWN";
    public static String QUEEN = "QUEEN";

    public static Figure makeFigure(String typeFigure, String color) {
        if (typeFigure.equals(PAWN)) {
            return new Pawn(color);
        } else if (typeFigure.equals(QUEEN)) {
            return new Queen(color);
        } else {
            throw new IllegalStateException("Type of figure should be pawn or queen");
        }
    }
}
