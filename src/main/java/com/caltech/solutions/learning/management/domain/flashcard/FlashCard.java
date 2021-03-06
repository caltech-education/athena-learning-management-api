package com.caltech.solutions.learning.management.domain.flashcard;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import com.caltech.solutions.learning.management.domain.subject.Subject;
import com.caltech.solutions.learning.management.domain.interfaces.IActivity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
@Document
@ApiModel("Flash Card")
public class FlashCard extends AbstractDomain implements IActivity {
    @DBRef
    @NotNull
    @NotBlank
    @ApiModelProperty("Owner")
    private IInstitutionUser owner;

    @NotNull
    @NotBlank
    @ApiModelProperty("User ID")
    private String userId;

    @DBRef
    @NotNull
    @NotBlank
    @ApiModelProperty("Subject")
    private Subject subject;

    @DBRef
    @NotNull
    @NotBlank
    @ApiModelProperty("Topic")
    private Topic topic;

    @NotNull
    @NotBlank
    @ApiModelProperty("Quiz")
    private String quiz;

    @NotNull
    @NotBlank
    @ApiModelProperty("Answer")
    private String answer;

    @ApiModelProperty("Tips")
    private Set<String> tips;

    @ApiModelProperty("Access")
    private String access;

    public FlashCard() {}

    public IInstitutionUser getOwner() {
        return owner;
    }

    public FlashCard setOwner(final IInstitutionUser owner) {
        this.owner = owner;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public FlashCard setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public Subject getSubject() {
        return subject;
    }

    public FlashCard setSubject(final Subject subject) {
        this.subject = subject;
        return this;
    }

    public Topic getTopic() {
        return topic;
    }

    public FlashCard setTopic(final Topic topic) {
        this.topic = topic;
        return this;
    }

    public String getQuiz() {
        return quiz;
    }

    public FlashCard setQuiz(final String quiz) {
        this.quiz = quiz;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public FlashCard setAnswer(final String answer) {
        this.answer = answer;
        return this;
    }

    public Set<String> getTips() {
        return tips;
    }

    public FlashCard setTips(final Set<String> tips) {
        this.tips = tips;
        return this;
    }

    public String getAccess() {
        return access;
    }

    public FlashCard setAccess(final String access) {
        this.access = access;
        return this;
    }
}
