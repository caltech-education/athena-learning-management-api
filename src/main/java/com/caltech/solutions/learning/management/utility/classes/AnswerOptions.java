package com.caltech.solutions.learning.management.utility.classes;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
public class AnswerOptions {
    private Boolean isCorrect;
    private String answer;

    public AnswerOptions() {}

    public Boolean getCorrect() {
        return isCorrect;
    }

    public AnswerOptions setCorrect(final Boolean correct) {
        isCorrect = correct;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public AnswerOptions setAnswer(final String answer) {
        this.answer = answer;
        return this;
    }
}
