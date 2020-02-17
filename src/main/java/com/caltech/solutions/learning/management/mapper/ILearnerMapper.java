package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.learner.Learner;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface ILearnerMapper extends IDomainMapper<Learner, LearnerTO> {
    @Override
    LearnerTO toDTO(final Learner domain);
    @Override
    Learner toDomain(final LearnerTO dto);
    @Override
    List<LearnerTO> toPageDTO(final List<Learner> items);
}
