package com.caltech.solutions.learning.management.repository;

import caltech.data.mongo.utilities.interfaces.IRepository;
import com.caltech.solutions.learning.management.domain.quiz.Quiz;
import org.springframework.stereotype.Repository;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@Repository
public interface IQuizRepository extends IRepository<Quiz, String> { }
