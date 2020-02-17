package com.caltech.solutions.learning.management.dto.subjectTO;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
public class ScoreTO extends AbstractDataTransferObject {
    private String description;
    private Double scorePoint;

    public ScoreTO() {}

    public String getDescription() {
        return description;
    }

    public ScoreTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getScorePoint() {
        return scorePoint;
    }

    public ScoreTO setScorePoint(Double scorePoint) {
        this.scorePoint = scorePoint;
        return this;
    }
}
