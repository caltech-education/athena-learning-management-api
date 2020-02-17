package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.learner.Attendance;
import com.caltech.solutions.learning.management.dto.learnerTO.AttendanceTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface IAttendanceMapper extends IDomainMapper<Attendance, AttendanceTO> {
    @Override
    AttendanceTO toDTO(final Attendance domain);
    @Override
    Attendance toDomain(final AttendanceTO dto);
    @Override
    List<AttendanceTO> toPageDTO(final List<Attendance> items);
}
