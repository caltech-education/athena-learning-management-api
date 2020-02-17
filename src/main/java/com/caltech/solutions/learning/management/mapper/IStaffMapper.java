package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.staff.Staff;
import com.caltech.solutions.learning.management.dto.staffTO.StaffTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface IStaffMapper extends IDomainMapper<Staff, StaffTO> {
    @Override
    StaffTO toDTO(final Staff domain);
    @Override
    Staff toDomain(final StaffTO dto);
    @Override
    List<StaffTO> toPageDTO(final List<Staff> items);
}
