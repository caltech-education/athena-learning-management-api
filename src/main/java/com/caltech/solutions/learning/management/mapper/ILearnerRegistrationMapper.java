package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.learner.LearnerRegistration;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerRegistrationTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface ILearnerRegistrationMapper extends IDomainMapper<LearnerRegistration, LearnerRegistrationTO> {
    @Override
    LearnerRegistrationTO toDTO(final LearnerRegistration domain);
    @Override
    LearnerRegistration toDomain(final LearnerRegistrationTO dto);
    @Override
    List<LearnerRegistrationTO> toPageDTO(final List<LearnerRegistration> items);
}
