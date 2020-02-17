package com.caltech.solutions.learning.management.domain.library;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
public class BookManagement extends AbstractDomain {
    private String customerId;
    @DBRef
    private Book book;
    private Integer numberInStock;
    private Integer numberOfBooksBorrowed;
    private HashMap<String, String> identifiers;
    private BookLoan bookLoan;

    public BookManagement() {}

    public String getCustomerId() {
        return customerId;
    }

    public BookManagement setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public Book getBook() {
        return book;
    }

    public BookManagement setBook(final Book book) {
        this.book = book;
        return this;
    }

    public Integer getNumberInStock() {
        return numberInStock;
    }

    public BookManagement setNumberInStock(final Integer numberInStock) {
        this.numberInStock = numberInStock;
        return this;
    }

    public Integer getNumberOfBooksBorrowed() {
        return numberOfBooksBorrowed;
    }

    public BookManagement setNumberOfBooksBorrowed(final Integer numberOfBooksBorrowed) {
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
        return this;
    }

    public HashMap<String, String> getIdentifiers() {
        return identifiers;
    }

    public BookManagement setIdentifiers(final HashMap<String, String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public BookLoan getBookLoan() {
        return bookLoan;
    }

    public BookManagement setBookLoan(final BookLoan bookLoan) {
        this.bookLoan = bookLoan;
        return this;
    }
}
