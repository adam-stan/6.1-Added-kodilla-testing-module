package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Pandemia przyspiesza.", (a) -> "ABC " + a + " ABC");
        poemBeautifier.beautify("Dziś 3003 nowe przypadki koronawirusa.", (a) -> a.toUpperCase());
        poemBeautifier.beautify("Trump chyba przegra wybory w USA,", (a) -> a + " ale w sumie niewiadomo.");
        poemBeautifier.beautify("Ten tekst nie zostanie wyświetlony w całości.", (a) -> a.substring(0,39));
    }
}
