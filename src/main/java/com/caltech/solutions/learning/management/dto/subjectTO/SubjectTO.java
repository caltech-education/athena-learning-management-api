package com.caltech.solutions.learning.management.dto.subjectTO;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
public class SubjectTO extends AbstractDataTransferObject {
    private CurriculumAreaTO curriculumAreaTO;
    private String subjectName;
    private String subjectAbbreviation;
    private boolean paid;
    private Double price = .0;

    public SubjectTO() {}

    public CurriculumAreaTO getCurriculumAreaTO() {
        return curriculumAreaTO;
    }

    public SubjectTO setCurriculumAreaTO(final CurriculumAreaTO curriculumAreaTO) {
        this.curriculumAreaTO = curriculumAreaTO;
        return this;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public SubjectTO setSubjectName(final String subjectName) {
        this.subjectName = subjectName;
        return this;
    }

    public String getSubjectAbbreviation() {
        return subjectAbbreviation;
    }

    public SubjectTO setSubjectAbbreviation(final String subjectAbbreviation) {
        this.subjectAbbreviation = subjectAbbreviation;
        return this;
    }

    public boolean isPaid() {
        return paid;
    }

    public SubjectTO setPaid(final boolean paid) {
        this.paid = paid;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public SubjectTO setPrice(final Double price) {
        this.price = price;
        return this;
    }
}
