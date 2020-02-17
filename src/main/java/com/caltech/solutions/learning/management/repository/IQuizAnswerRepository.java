package com.caltech.solutions.learning.management.repository;

import caltech.data.mongo.utilities.interfaces.IRepository;
import com.caltech.solutions.learning.management.domain.quiz.QuizAnswer;
import org.springframework.stereotype.Repository;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@Repository
public interface IQuizAnswerRepository extends IRepository<QuizAnswer, String> { }
