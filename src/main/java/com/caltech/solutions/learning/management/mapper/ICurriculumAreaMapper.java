package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.subject.CurriculumArea;
import com.caltech.solutions.learning.management.dto.subjectTO.CurriculumAreaTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface ICurriculumAreaMapper extends IDomainMapper<CurriculumArea, CurriculumAreaTO> {
    @Override
    CurriculumAreaTO toDTO(final CurriculumArea domain);
    @Override
    CurriculumArea toDomain(final CurriculumAreaTO dto);
    @Override
    List<CurriculumAreaTO> toPageDTO(final List<CurriculumArea> items);
}
