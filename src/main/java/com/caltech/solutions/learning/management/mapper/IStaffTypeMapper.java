package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.staff.StaffType;
import com.caltech.solutions.learning.management.dto.staffTO.StaffTypeTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface IStaffTypeMapper extends IDomainMapper<StaffType, StaffTypeTO> {
    @Override
    StaffTypeTO toDTO(final StaffType domain);
    @Override
    StaffType toDomain(final StaffTypeTO dto);
    @Override
    List<StaffTypeTO> toPageDTO(final List<StaffType> items);
}
