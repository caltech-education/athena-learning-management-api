package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.subjectTO.CurriculumAreaTO;
import com.caltech.solutions.learning.management.mapper.ICurriculumAreaMapper;
import com.caltech.solutions.learning.management.repository.ICurriculumAreaRepository;
import org.springframework.stereotype.Service;

@Service
public class CurriculumAreaService extends AbstractService<CurriculumAreaTO, String> {
    protected CurriculumAreaService(final ICurriculumAreaRepository repository, final ICurriculumAreaMapper mapper) {
        super(repository, mapper);
    }
}
