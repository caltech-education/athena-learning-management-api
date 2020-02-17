package com.caltech.solutions.learning.management.dto.periodTO;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;

import java.util.Date;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
public class LearningPeriodTO extends AbstractDataTransferObject {
    private String name;
    private String year;
    private Date startDate;
    private Date endDate;
    private String description;

    public LearningPeriodTO() {}

    public String getName() {
        return name;
    }

    public LearningPeriodTO setName(final String name) {
        this.name = name;
        return this;
    }

    public String getYear() {
        return year;
    }

    public LearningPeriodTO setYear(final String year) {
        this.year = year;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public LearningPeriodTO setStartDate(final Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public LearningPeriodTO setEndDate(final Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public LearningPeriodTO setDescription(final String description) {
        this.description = description;
        return this;
    }
}
