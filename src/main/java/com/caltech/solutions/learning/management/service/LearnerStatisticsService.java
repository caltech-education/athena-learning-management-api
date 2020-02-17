package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerStatisticsTO;
import com.caltech.solutions.learning.management.mapper.ILearnerStatisticsMapper;
import com.caltech.solutions.learning.management.repository.ILearnerStatisticsRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class LearnerStatisticsService extends AbstractService<LearnerStatisticsTO, String> {
    protected LearnerStatisticsService(final ILearnerStatisticsRepository repository, final ILearnerStatisticsMapper mapper) {
        super(repository, mapper);
    }
}
