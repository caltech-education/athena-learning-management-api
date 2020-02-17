package com.caltech.solutions.learning.management.dto.staffTO;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Weverton Souza.
 * Created on 07/02/2020
 */
public class StaffTypeTO extends AbstractDataTransferObject {
    private String customerId;
    private String name;

    public StaffTypeTO() {}

    public String getCustomerId() {
        return customerId;
    }

    public StaffTypeTO setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getName() {
        return name;
    }

    public StaffTypeTO setName(final String name) {
        this.name = name.toUpperCase();
        return this;
    }
}
