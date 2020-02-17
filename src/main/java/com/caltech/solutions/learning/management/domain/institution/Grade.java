package com.caltech.solutions.learning.management.domain.institution;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.domain.period.LearningPeriod;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Grade extends AbstractDomain {
    private String customerId;
    @DBRef
    private LearningPeriod learningPeriod;
    @DBRef
    private List<SubjectOffer> subjectsOffer;
    private Double scoreNeeded;

    public Grade() {}

    public String getCustomerId() {
        return customerId;
    }

    public Grade setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public LearningPeriod getLearningPeriod() {
        return learningPeriod;
    }

    public Grade setLearningPeriod(final LearningPeriod learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public List<SubjectOffer> getSubjectsOffer() {
        return subjectsOffer;
    }

    public Grade setSubjectsOffer(final List<SubjectOffer> subjectsOffer) {
        this.subjectsOffer = subjectsOffer;
        return this;
    }

    public Double getScoreNeeded() {
        return scoreNeeded;
    }

    public Grade setScoreNeeded(final Double scoreNeeded) {
        this.scoreNeeded = scoreNeeded;
        return this;
    }
}
