package com.caltech.solutions.learning.management.domain.learner;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.domain.period.LearningPeriod;
import com.caltech.solutions.learning.management.domain.subject.Subject;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 06/02/2020
 */
@Document
public class LearnerRegistration extends AbstractDomain {
    @DBRef
    private Learner learner;
    @DBRef
    private List<Subject> subjects;
    @DBRef
    private LearningPeriod learningPeriod;
    private String customerId;
    private String year;

    public LearnerRegistration() {}

    public Learner getLearner() {
        return learner;
    }

    public LearnerRegistration setLearner(final Learner learner) {
        this.learner = learner;
        return this;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public LearnerRegistration setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

    public LearningPeriod getLearningPeriod() {
        return learningPeriod;
    }

    public LearnerRegistration setLearningPeriod(final LearningPeriod learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public LearnerRegistration setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getYear() {
        return year;
    }

    public LearnerRegistration setYear(final String year) {
        this.year = year;
        return this;
    }
}
