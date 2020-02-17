package com.caltech.solutions.learning.management.domain.staff;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.domain.access.UserAccess;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
@Document
public class Staff extends AbstractDomain implements IInstitutionUser {
    private String userId;
    @DBRef
    private UserAccess userAccess;
    @DBRef
    private StaffType staffType;
    private String formation;
    private String speciality;
    private Date startDate;

    public Staff() {}

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public Staff setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public UserAccess getUserAccess() {
        return userAccess;
    }

    public Staff setUserAccess(final UserAccess userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public StaffType getStaffType() {
        return staffType;
    }

    public Staff setStaffType(final StaffType staffType) {
        this.staffType = staffType;
        return this;
    }

    public String getFormation() {
        return formation;
    }

    public Staff setFormation(final String formation) {
        this.formation = formation;
        return this;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Staff setSpeciality(final String speciality) {
        this.speciality = speciality;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Staff setStartDate(final Date startDate) {
        this.startDate = startDate;
        return this;
    }
}
