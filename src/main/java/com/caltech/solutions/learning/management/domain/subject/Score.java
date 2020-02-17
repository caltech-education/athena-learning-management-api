package com.caltech.solutions.learning.management.domain.subject;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
@Document
public class Score extends AbstractDomain {
    private String description;
    private Double scorePoint;

    public Score() {}

    public String getDescription() {
        return description;
    }

    public Score setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getScorePoint() {
        return scorePoint;
    }

    public Score setScorePoint(Double scorePoint) {
        this.scorePoint = scorePoint;
        return this;
    }
}
