package com.caltech.solutions.learning.management.domain.subject;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.domain.period.LearningPeriod;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
@Document
public class SubjectScore extends AbstractDomain {
    @DBRef
    private Subject subject;
    @DBRef
    private Set<Score> scores;
    @DBRef
    private LearningPeriod learningPeriod;
    private String year;
    private String period;
    private Double scoreNeeded;

    public SubjectScore() {}

    public Subject getSubject() {
        return subject;
    }

    public SubjectScore setSubject(final Subject subject) {
        this.subject = subject;
        return this;
    }

    public Set<Score> getScores() {
        return scores;
    }

    public SubjectScore setScores(final Set<Score> scores) {
        this.scores = scores;
        return this;
    }

    public LearningPeriod getLearningPeriod() {
        return learningPeriod;
    }

    public SubjectScore setLearningPeriod(final LearningPeriod learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public String getYear() {
        return year;
    }

    public SubjectScore setYear(final String year) {
        this.year = year;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    public SubjectScore setPeriod(final String period) {
        this.period = period;
        return this;
    }

    public Double getScoreNeeded() {
        return scoreNeeded;
    }

    public SubjectScore setScoreNeeded(final Double scoreNeeded) {
        this.scoreNeeded = scoreNeeded;
        return this;
    }
}
