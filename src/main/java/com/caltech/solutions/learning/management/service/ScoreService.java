package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.subjectTO.ScoreTO;
import com.caltech.solutions.learning.management.mapper.ILearnerMapper;
import com.caltech.solutions.learning.management.repository.ILearnerRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class ScoreService extends AbstractService<ScoreTO, String> {
    protected ScoreService(final ILearnerRepository repository, final ILearnerMapper mapper) {
        super(repository, mapper);
    }
}
