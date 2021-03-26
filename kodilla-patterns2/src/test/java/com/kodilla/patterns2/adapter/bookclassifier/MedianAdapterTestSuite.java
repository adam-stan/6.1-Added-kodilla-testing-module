package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void testMedianAdapter(){

        //Given
        Set<Book> setOfBooks = new HashSet<>();
        Book Book1 = new Book("Czeslaw Kowalski", "Kiedys to bylo", 2020, "2020");
        Book Book2 = new Book("Janusz Kolski", "A nie to co teraz", 2019, "2019");
        Book Book3 = new Book("Czesław Czesławski", "Swieta swieta i po swietach", 2018, "2018");

        setOfBooks.add(Book1);
        setOfBooks.add(Book2);
        setOfBooks.add(Book3);

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(setOfBooks);

        //Then
        Assert.assertEquals(2019, median);
    }
}
