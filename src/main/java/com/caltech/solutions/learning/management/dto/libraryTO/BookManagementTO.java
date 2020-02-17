package com.caltech.solutions.learning.management.dto.libraryTO;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;

import java.util.HashMap;

/**
 * @author Weverton Souza.
 * Created on 07/02/2020
 */
public class BookManagementTO extends AbstractDomain {
    private String customerId;
    private BookTO bookTO;
    private Integer numberInStock;
    private Integer numberOfBooksBorrowed;
    private HashMap<String, String> identifiers;
    private BookLoanTO bookLoanTO;

    public BookManagementTO() {}

    public String getCustomerId() {
        return customerId;
    }

    public BookManagementTO setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public BookTO getBookTO() {
        return bookTO;
    }

    public BookManagementTO setBookTO(final BookTO bookTO) {
        this.bookTO = bookTO;
        return this;
    }

    public Integer getNumberInStock() {
        return numberInStock;
    }

    public BookManagementTO setNumberInStock(final Integer numberInStock) {
        this.numberInStock = numberInStock;
        return this;
    }

    public Integer getNumberOfBooksBorrowed() {
        return numberOfBooksBorrowed;
    }

    public BookManagementTO setNumberOfBooksBorrowed(final Integer numberOfBooksBorrowed) {
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
        return this;
    }

    public HashMap<String, String> getIdentifiers() {
        return identifiers;
    }

    public BookManagementTO setIdentifiers(final HashMap<String, String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public BookLoanTO getBookLoanTO() {
        return bookLoanTO;
    }

    public BookManagementTO setBookLoanTO(final BookLoanTO bookLoanTO) {
        this.bookLoanTO = bookLoanTO;
        return this;
    }
}
