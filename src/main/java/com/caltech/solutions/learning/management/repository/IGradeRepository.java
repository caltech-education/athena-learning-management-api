package com.caltech.solutions.learning.management.repository;

import caltech.data.mongo.utilities.interfaces.IRepository;
import com.caltech.solutions.learning.management.domain.institution.Grade;
import org.springframework.stereotype.Repository;

/**
 * @author Weverton Souza.
 * Created on 07/02/2020
 */
@Repository
public interface IGradeRepository extends IRepository<Grade, String> {}
