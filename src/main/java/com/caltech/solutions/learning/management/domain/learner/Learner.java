package com.caltech.solutions.learning.management.domain.learner;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.domain.access.UserAccess;
import com.caltech.solutions.learning.management.domain.institution.Grade;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
@Document
public class Learner extends AbstractDomain implements IInstitutionUser {
    private String userId;
    @DBRef
    private List<Grade> grade;
    @DBRef
    private UserAccess userAccess;
    private boolean activeStudent;

    public Learner() {}

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public Learner setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public List<Grade> getGrade() {
        return grade;
    }

    public Learner setGrade(final List<Grade> grade) {
        this.grade = grade;
        return this;
    }

    public boolean isActiveStudent() {
        return activeStudent;
    }

    public Learner setActiveStudent(final boolean activeStudent) {
        this.activeStudent = activeStudent;
        return this;
    }

    public UserAccess getUserAccess() {
        return userAccess;
    }

    public Learner setUserAccess(final UserAccess userAccess) {
        this.userAccess = userAccess;
        return this;
    }
}
