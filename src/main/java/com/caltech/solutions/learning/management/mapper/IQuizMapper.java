package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.quiz.Quiz;
import com.caltech.solutions.learning.management.dto.quizTO.QuizDTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@Mapper
public interface IQuizMapper extends IDomainMapper<Quiz, QuizDTO> {
    @Override
    QuizDTO toDTO(Quiz domain);
    @Override
    Quiz toDomain(QuizDTO dto);
    @Override
    List<QuizDTO> toPageDTO(List<Quiz> items);
}
