package com.caltech.solutions.learning.management.dto.staffTO;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;
import com.caltech.solutions.learning.management.domain.access.UserAccess;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import com.caltech.solutions.learning.management.dto.accessTO.UserAccessTO;

import java.util.Date;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
public class StaffTO extends AbstractDataTransferObject implements IInstitutionUser {
    private String userId;
    private UserAccessTO userAccess;
    private StaffTypeTO staffTypeTO;
    private String formation;
    private String speciality;
    private Date startDate;

    public StaffTO() {}

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public StaffTO setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public UserAccessTO getUserAccess() {
        return userAccess;
    }

    public StaffTO setUserAccess(final UserAccessTO userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public StaffTypeTO getStaffTypeTO() {
        return staffTypeTO;
    }

    public StaffTO setStaffTypeTO(final StaffTypeTO staffTypeTO) {
        this.staffTypeTO = staffTypeTO;
        return this;
    }

    public String getFormation() {
        return formation;
    }

    public StaffTO setFormation(final String formation) {
        this.formation = formation;
        return this;
    }

    public String getSpeciality() {
        return speciality;
    }

    public StaffTO setSpeciality(final String speciality) {
        this.speciality = speciality;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public StaffTO setStartDate(final Date startDate) {
        this.startDate = startDate;
        return this;
    }
}
