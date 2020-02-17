package com.caltech.solutions.learning.management.domain.quiz;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.domain.interfaces.IActivity;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import com.caltech.solutions.learning.management.domain.learner.Learner;
import com.caltech.solutions.learning.management.utility.classes.AnswerOptions;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@Document
public class QuizAnswer extends AbstractDomain implements IActivity {
    @DBRef
    private IInstitutionUser owner;
    @DBRef
    private Quiz quiz;
    private Set<AnswerOptions> answerOptions;
    private Integer numberOfRetries;

    public QuizAnswer() {}

    public IInstitutionUser getOwner() {
        return owner;
    }

    public QuizAnswer setOwner(final IInstitutionUser owner) {
        this.owner = owner;
        return this;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public QuizAnswer setQuiz(final Quiz quiz) {
        this.quiz = quiz;
        return this;
    }

    public Set<AnswerOptions> getAnswerOptions() {
        return answerOptions;
    }

    public QuizAnswer setAnswerOptions(final Set<AnswerOptions> answerOptions) {
        this.answerOptions = answerOptions;
        return this;
    }

    public Integer getNumberOfRetries() {
        return numberOfRetries;
    }

    public QuizAnswer setNumberOfRetries(final Integer numberOfRetries) {
        this.numberOfRetries = numberOfRetries;
        return this;
    }
}
