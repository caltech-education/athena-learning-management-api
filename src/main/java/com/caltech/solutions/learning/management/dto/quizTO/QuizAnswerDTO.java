package com.caltech.solutions.learning.management.dto.quizTO;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;
import com.caltech.solutions.learning.management.utility.classes.AnswerOptions;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.Min;
import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@ApiModel(value = "Quiz Answer")
public class QuizAnswerDTO extends AbstractDataTransferObject {
    private String userId;
    private String quizId;
    @Min(value = 1)
    private Set<AnswerOptions> answerOptions;
    private Integer numberOfRetries;

    public QuizAnswerDTO() {}

    public String getUserId() {
        return userId;
    }

    public QuizAnswerDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getQuizId() {
        return quizId;
    }

    public QuizAnswerDTO setQuizId(String quizId) {
        this.quizId = quizId;
        return this;
    }

    public Set<AnswerOptions> getAnswerOptions() {
        return answerOptions;
    }

    public QuizAnswerDTO setAnswerOptions(Set<AnswerOptions> answerOptions) {
        this.answerOptions = answerOptions;
        return this;
    }

    public Integer getNumberOfRetries() {
        return numberOfRetries;
    }

    public QuizAnswerDTO setNumberOfRetries(Integer numberOfRetries) {
        this.numberOfRetries = numberOfRetries;
        return this;
    }
}
