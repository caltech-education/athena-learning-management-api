package com.caltech.solutions.learning.management.domain.subject;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
@Document
public class Subject extends AbstractDomain {
    @DBRef
    private CurriculumArea curriculumArea;
    private String subjectName;
    private String subjectAbbreviation;
    private boolean paid;
    private Double price = .0;

    public Subject() {}

    public CurriculumArea getCurriculumArea() {
        return curriculumArea;
    }

    public Subject setCurriculumArea(final CurriculumArea curriculumArea) {
        this.curriculumArea = curriculumArea;
        return this;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Subject setSubjectName(final String subjectName) {
        this.subjectName = subjectName;
        return this;
    }

    public String getSubjectAbbreviation() {
        return subjectAbbreviation;
    }

    public Subject setSubjectAbbreviation(final String subjectAbbreviation) {
        this.subjectAbbreviation = subjectAbbreviation;
        return this;
    }

    public boolean isPaid() {
        return paid;
    }

    public Subject setPaid(final boolean paid) {
        this.paid = paid;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Subject setPrice(final Double price) {
        this.price = price;
        return this;
    }
}
