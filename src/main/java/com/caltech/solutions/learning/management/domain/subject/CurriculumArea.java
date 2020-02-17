package com.caltech.solutions.learning.management.domain.subject;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.enumeration.knowledgeAreaType;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CurriculumArea extends AbstractDomain {
    private String componentName;
    private knowledgeAreaType knowledgeAreaType;
    private String description;

    public CurriculumArea() {}

    public String getComponentName() {
        return componentName;
    }

    public CurriculumArea setComponentName(final String componentName) {
        this.componentName = componentName;
        return this;
    }

    public com.caltech.solutions.learning.management.enumeration.knowledgeAreaType getKnowledgeAreaType() {
        return knowledgeAreaType;
    }

    public CurriculumArea setKnowledgeAreaType(final com.caltech.solutions.learning.management.enumeration.knowledgeAreaType knowledgeAreaType) {
        this.knowledgeAreaType = knowledgeAreaType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CurriculumArea setDescription(final String description) {
        this.description = description;
        return this;
    }
}
