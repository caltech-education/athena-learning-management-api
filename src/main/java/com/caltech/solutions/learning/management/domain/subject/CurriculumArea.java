package com.caltech.solutions.learning.management.domain.subject;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.learning.management.enumeration.KnowledgeAreaType;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CurriculumArea extends AbstractDomain {
    private String componentName;
    private KnowledgeAreaType knowledgeAreaType;
    private String description;

    public CurriculumArea() {}

    public String getComponentName() {
        return componentName;
    }

    public CurriculumArea setComponentName(final String componentName) {
        this.componentName = componentName;
        return this;
    }

    public KnowledgeAreaType getKnowledgeAreaType() {
        return knowledgeAreaType;
    }

    public CurriculumArea setKnowledgeAreaType(final KnowledgeAreaType knowledgeAreaType) {
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
