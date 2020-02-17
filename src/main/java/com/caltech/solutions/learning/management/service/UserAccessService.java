package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.accessTO.UserAccessTO;
import com.caltech.solutions.learning.management.mapper.IUserAccessMapper;
import com.caltech.solutions.learning.management.repository.IUserAccessRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class UserAccessService extends AbstractService<UserAccessTO, String> {
    protected UserAccessService(final IUserAccessRepository repository, final IUserAccessMapper mapper) {
        super(repository, mapper);
    }
}
