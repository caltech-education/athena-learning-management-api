package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.quizTO.QuizDTO;
import com.caltech.solutions.learning.management.mapper.IQuizMapper;
import com.caltech.solutions.learning.management.repository.IQuizRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@Service
public class QuizService extends AbstractService<QuizDTO, String> {
    protected QuizService(IQuizRepository quizRepository, IQuizMapper quizMapper) {
        super(quizRepository, quizMapper);
    }
}
