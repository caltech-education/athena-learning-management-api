package com.caltech.solutions.learning.management.domain.learner;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.domain.period.LearningPeriod;
import com.caltech.solutions.learning.management.domain.library.Book;
import com.caltech.solutions.learning.management.domain.subject.SubjectScore;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
@Document
public class LearnerStatistics extends AbstractDomain {
    @DBRef
    private Learner learner;

    @DBRef
    private LearningPeriod learningPeriod;

    @DBRef
    private Set<SubjectScore> scores;

    @DBRef
    private Set<Attendance> attendances;

    @DBRef
    private Set<Book> booksRead;

    public LearnerStatistics() {}

    public Learner getLearner() {
        return learner;
    }

    public LearnerStatistics setLearner(final Learner learner) {
        this.learner = learner;
        return this;
    }

    public LearningPeriod getLearningPeriod() {
        return learningPeriod;
    }

    public LearnerStatistics setLearningPeriod(final LearningPeriod learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public Set<SubjectScore> getScores() {
        return scores;
    }

    public LearnerStatistics setScores(final Set<SubjectScore> scores) {
        this.scores = scores;
        return this;
    }

    public Set<Attendance> getAttendances() {
        return attendances;
    }

    public LearnerStatistics setAttendances(final Set<Attendance> attendances) {
        this.attendances = attendances;
        return this;
    }

    public Set<Book> getBooksRead() {
        return booksRead;
    }

    public LearnerStatistics setBooksRead(final Set<Book> booksRead) {
        this.booksRead = booksRead;
        return this;
    }
}
