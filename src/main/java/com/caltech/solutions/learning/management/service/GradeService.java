package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.institutionTO.GradeTO;
import com.caltech.solutions.learning.management.mapper.IGradeMapper;
import com.caltech.solutions.learning.management.repository.IGradeRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class GradeService extends AbstractService<GradeTO, String> {
    protected GradeService(final IGradeRepository repository, final IGradeMapper mapper) {
        super(repository, mapper);
    }
}
