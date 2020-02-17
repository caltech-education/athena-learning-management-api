package com.caltech.solutions.learning.management.domain.staff;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StaffType extends AbstractDomain {
    private String customerId;
    private String name;

    public StaffType() {}

    public String getCustomerId() {
        return customerId;
    }

    public StaffType setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getName() {
        return name;
    }

    public StaffType setName(final String name) {
        this.name = name.toUpperCase();
        return this;
    }
}
