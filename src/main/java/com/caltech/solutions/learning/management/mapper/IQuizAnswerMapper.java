package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.quiz.QuizAnswer;
import com.caltech.solutions.learning.management.dto.quizTO.QuizAnswerDTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@Mapper
public interface IQuizAnswerMapper extends IDomainMapper<QuizAnswer, QuizAnswerDTO> {
    @Override
    QuizAnswerDTO toDTO(QuizAnswer domain);
    @Override
    QuizAnswer toDomain(QuizAnswerDTO dto);
    @Override
    List<QuizAnswerDTO> toPageDTO(List<QuizAnswer> items);
}
