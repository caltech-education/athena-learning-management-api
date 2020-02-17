package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.staffTO.StaffTO;
import com.caltech.solutions.learning.management.mapper.IStaffMapper;
import com.caltech.solutions.learning.management.repository.IStaffRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class StaffTypeService extends AbstractService<StaffTO, String> {
    protected StaffTypeService(final IStaffRepository repository, final IStaffMapper mapper) {
        super(repository, mapper);
    }
}
