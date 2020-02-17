package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.institution.SubjectOffer;
import com.caltech.solutions.learning.management.dto.institutionTO.SubjectOfferTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface ISubjectOfferMapper extends IDomainMapper<SubjectOffer, SubjectOfferTO> {
    @Override
    SubjectOfferTO toDTO(final SubjectOffer domain);
    @Override
    SubjectOffer toDomain(final SubjectOfferTO dto);
    @Override
    List<SubjectOfferTO> toPageDTO(final List<SubjectOffer> items);
}
