package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.institution.Grade;
import com.caltech.solutions.learning.management.dto.institutionTO.GradeTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface IGradeMapper extends IDomainMapper<Grade, GradeTO> {
    @Override
    GradeTO toDTO(final Grade domain);
    @Override
    Grade toDomain(final GradeTO dto);
    @Override
    List<GradeTO> toPageDTO(final List<Grade> items);
}
