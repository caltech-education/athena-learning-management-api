package com.caltech.solutions.learning.management.repository;

import caltech.data.mongo.utilities.interfaces.IRepository;
import com.caltech.solutions.learning.management.domain.staff.Staff;
import org.springframework.stereotype.Repository;

/**
 * @author Weverton Souza.
 * Created on 07/02/2020
 */
@Repository
public interface IUserStaffRepository extends IRepository<Staff, String> {}
