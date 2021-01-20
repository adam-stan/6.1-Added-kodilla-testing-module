package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Item item = new Item(new Product("Table"), new BigDecimal(200), 1, new BigDecimal(150));
        Item item2 = new Item(new Product("Chairs"), new BigDecimal(400), 4, new BigDecimal(300));
        Item item3 = new Item(new Product("Flowers"), new BigDecimal(20), 1, new BigDecimal(20));

        Invoice invoice = new Invoice("1543");

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceID = invoice.getId();

        //Then
        assertNotEquals(0, invoiceID);

        //CleanUp
        invoiceDao.delete(invoice);
    }
}
