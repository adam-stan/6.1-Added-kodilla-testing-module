package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        //Creating the library

        Library library = new Library("First Java Library");
        library.getBooks().add(new Book("Storm of the Century", "Stephen King", LocalDate.of(1999, 1, 1)));
        library.getBooks().add(new Book("The doll", "Bolesław Prus", LocalDate.of(1890, 1, 1)));
        library.getBooks().add(new Book("Brief Answers to the Big Questions", "Stephen Hawking", LocalDate.of(2018, 1, 1)));
        library.getBooks().add(new Book("Harry Potter and the Order of the Phoenix", "J.K.Rowling", LocalDate.of(2003, 1, 1)));
        library.getBooks().add(new Book("With Fire and Sword", "Henryk Sienkiewicz", LocalDate.of(1884, 1, 1)));

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second Java library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Third Java library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //When
        library.getBooks().clear();
        System.out.println("Now let's clear the first Java Library");
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //Then
        assertEquals(0, library.getBooks().size());
        assertEquals(0, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
