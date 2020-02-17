package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.subject.Score;
import com.caltech.solutions.learning.management.dto.subjectTO.ScoreTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface IScoreMapper extends IDomainMapper<Score, ScoreTO> {
    @Override
    ScoreTO toDTO(final Score domain);
    @Override
    Score toDomain(final ScoreTO dto);
    @Override
    List<ScoreTO> toPageDTO(final List<Score> items);
}
