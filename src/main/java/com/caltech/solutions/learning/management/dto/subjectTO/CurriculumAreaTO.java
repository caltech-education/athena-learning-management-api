package com.caltech.solutions.learning.management.dto.subjectTO;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;
import com.caltech.solutions.learning.management.enumeration.knowledgeAreaType;

public class CurriculumAreaTO extends AbstractDataTransferObject {
    private String componentName;
    private knowledgeAreaType knowledgeAreaType;
    private String description;

    public CurriculumAreaTO() {}

    public String getComponentName() {
        return componentName;
    }

    public CurriculumAreaTO setComponentName(final String componentName) {
        this.componentName = componentName;
        return this;
    }

    public com.caltech.solutions.learning.management.enumeration.knowledgeAreaType getKnowledgeAreaType() {
        return knowledgeAreaType;
    }

    public CurriculumAreaTO setKnowledgeAreaType(final com.caltech.solutions.learning.management.enumeration.knowledgeAreaType knowledgeAreaType) {
        this.knowledgeAreaType = knowledgeAreaType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CurriculumAreaTO setDescription(final String description) {
        this.description = description;
        return this;
    }
}
