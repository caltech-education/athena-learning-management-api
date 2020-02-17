package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.subject.SubjectScore;
import com.caltech.solutions.learning.management.dto.subjectTO.SubjectScoreTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface ISubjectScoreMapper extends IDomainMapper<SubjectScore, SubjectScoreTO> {
    @Override
    SubjectScoreTO toDTO(final SubjectScore domain);
    @Override
    SubjectScore toDomain(final SubjectScoreTO dto);
    @Override
    List<SubjectScoreTO> toPageDTO(final List<SubjectScore> items);
}
