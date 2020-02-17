package com.caltech.solutions.learning.management.dto.quizTO;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;
import com.caltech.solutions.learning.management.utility.classes.AnswerOptions;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@ApiModel(value = "Quiz")
public class QuizDTO extends AbstractDataTransferObject {
    private String userId;
    private String subjectId;
    private String description;
    private String learnRecommendation;
    private Set<AnswerOptions> answerOptions;
    private Integer maxRetries;
    private String tip;
    private Date expiration;

    public QuizDTO() {}

    public String getUserId() {
        return userId;
    }

    public QuizDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public QuizDTO setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QuizDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLearnRecommendation() {
        return learnRecommendation;
    }

    public QuizDTO setLearnRecommendation(String learnRecommendation) {
        this.learnRecommendation = learnRecommendation;
        return this;
    }

    public Set<AnswerOptions> getAnswerOptions() {
        return answerOptions;
    }

    public QuizDTO setAnswerOptions(Set<AnswerOptions> answerOptions) {
        this.answerOptions = answerOptions;
        return this;
    }

    public Integer getMaxRetries() {
        return maxRetries;
    }

    public QuizDTO setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    public String getTip() {
        return tip;
    }

    public QuizDTO setTip(String tip) {
        this.tip = tip;
        return this;
    }

    public Date getExpiration() {
        return expiration;
    }

    public QuizDTO setExpiration(Date expiration) {
        this.expiration = expiration;
        return this;
    }
}
