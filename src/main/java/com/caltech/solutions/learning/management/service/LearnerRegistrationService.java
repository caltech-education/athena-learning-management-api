package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerRegistrationTO;
import com.caltech.solutions.learning.management.mapper.ILearnerRegistrationMapper;
import com.caltech.solutions.learning.management.repository.ILearnerRegistrationRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class LearnerRegistrationService extends AbstractService<LearnerRegistrationTO, String> {
    protected LearnerRegistrationService(final ILearnerRegistrationRepository repository, final ILearnerRegistrationMapper mapper) {
        super(repository, mapper);
    }
}
