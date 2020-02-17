package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.subjectTO.SubjectScoreTO;
import com.caltech.solutions.learning.management.mapper.ISubjectScoreMapper;
import com.caltech.solutions.learning.management.repository.ISubjectScoreRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class SubjectScoreService extends AbstractService<SubjectScoreTO, String> {
    protected SubjectScoreService(final ISubjectScoreRepository repository, final ISubjectScoreMapper mapper) {
        super(repository, mapper);
    }
}
