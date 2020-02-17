package com.caltech.solutions.learning.management.domain.access;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.enumeration.PrivilegeType;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
public class UserAccess extends AbstractDomain {
    private Short level;
    private String shortName;
    private String fullName;
    private String customerId;
    private Set<PrivilegeType> privilegeTypes;

    public UserAccess() {}

    public Short getLevel() {
        return level;
    }

    public UserAccess setLevel(final Short level) {
        this.level = level;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public UserAccess setShortName(final String shortName) {
        this.shortName = shortName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserAccess setFullName(final String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public UserAccess setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public Set<PrivilegeType> getPrivilegeTypes() {
        return privilegeTypes;
    }

    public UserAccess setPrivilegeTypes(final Set<PrivilegeType> privilegeTypes) {
        this.privilegeTypes = privilegeTypes;
        return this;
    }
}
