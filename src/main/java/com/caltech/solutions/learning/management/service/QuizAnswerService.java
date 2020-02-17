package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.quizTO.QuizAnswerDTO;
import com.caltech.solutions.learning.management.mapper.IQuizAnswerMapper;
import com.caltech.solutions.learning.management.repository.IQuizAnswerRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@Service
public class QuizAnswerService extends AbstractService<QuizAnswerDTO, String> {
    protected QuizAnswerService(IQuizAnswerRepository quizAnswerRepository, IQuizAnswerMapper quizAnswerMapper) {
        super(quizAnswerRepository, quizAnswerMapper);
    }
}
