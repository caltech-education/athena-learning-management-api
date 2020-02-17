package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.institutionTO.SubjectOfferTO;
import com.caltech.solutions.learning.management.mapper.ISubjectOfferMapper;
import com.caltech.solutions.learning.management.repository.ISubjectOfferRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class SubjectOfferService extends AbstractService<SubjectOfferTO, String> {
    protected SubjectOfferService(final ISubjectOfferRepository repository, final ISubjectOfferMapper mapper) {
        super(repository, mapper);
    }
}
