package com.caltech.solutions.learning.management.domain.quiz;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.domain.interfaces.IActivity;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import com.caltech.solutions.learning.management.domain.subject.Subject;
import com.caltech.solutions.learning.management.utility.classes.AnswerOptions;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@Document
public class Quiz extends AbstractDomain implements IActivity {
    @DBRef
    private IInstitutionUser owner;
    @DBRef
    private Subject subject;
    private String access;
    private String description;
    private String learnRecommendation;
    private Set<AnswerOptions> answerOptions;
    private Integer maxRetries;
    private String tip;
    private Date expiration;

    public Quiz() {}

    public IInstitutionUser getOwner() {
        return owner;
    }

    public Quiz setOwner(final IInstitutionUser owner) {
        this.owner = owner;
        return this;
    }

    public Subject getSubject() {
        return subject;
    }

    public Quiz setSubject(final Subject subject) {
        this.subject = subject;
        return this;
    }

    public String getAccess() {
        return access;
    }

    public Quiz setAccess(final String access) {
        this.access = access;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Quiz setDescription(final String description) {
        this.description = description;
        return this;
    }

    public String getLearnRecommendation() {
        return learnRecommendation;
    }

    public Quiz setLearnRecommendation(final String learnRecommendation) {
        this.learnRecommendation = learnRecommendation;
        return this;
    }

    public Set<AnswerOptions> getAnswerOptions() {
        return answerOptions;
    }

    public Quiz setAnswerOptions(final Set<AnswerOptions> answerOptions) {
        this.answerOptions = answerOptions;
        return this;
    }

    public Integer getMaxRetries() {
        return maxRetries;
    }

    public Quiz setMaxRetries(final Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    public String getTip() {
        return tip;
    }

    public Quiz setTip(final String tip) {
        this.tip = tip;
        return this;
    }

    public Date getExpiration() {
        return expiration;
    }

    public Quiz setExpiration(final Date expiration) {
        this.expiration = expiration;
        return this;
    }
}
