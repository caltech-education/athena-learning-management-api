package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.learner.LearnerStatistics;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerStatisticsTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface ILearnerStatisticsMapper extends IDomainMapper<LearnerStatistics, LearnerStatisticsTO> {
    @Override
    LearnerStatisticsTO toDTO(final LearnerStatistics domain);
    @Override
    LearnerStatistics toDomain(final LearnerStatisticsTO dto);
    @Override
    List<LearnerStatisticsTO> toPageDTO(final List<LearnerStatistics> items);
}
