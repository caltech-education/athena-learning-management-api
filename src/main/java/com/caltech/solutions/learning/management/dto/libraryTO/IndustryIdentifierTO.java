package com.caltech.solutions.learning.management.dto.libraryTO;

import com.caltech.solutions.learning.management.enumeration.TypeIndustryIdentifier;

/**
 * @author Weverton Souza.
 * Created on 07/02/2020
 */
public class IndustryIdentifierTO {
    private TypeIndustryIdentifier type;
    private String identifier;

    public IndustryIdentifierTO() {}

    public TypeIndustryIdentifier getType() {
        return type;
    }

    public IndustryIdentifierTO setType(final TypeIndustryIdentifier type) {
        this.type = type;
        return this;
    }

    public String getIdentifier() {
        return identifier;
    }

    public IndustryIdentifierTO setIdentifier(final String identifier) {
        this.identifier = identifier;
        return this;
    }
}
