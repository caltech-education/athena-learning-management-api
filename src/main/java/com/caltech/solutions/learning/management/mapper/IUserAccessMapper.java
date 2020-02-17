package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.access.UserAccess;
import com.caltech.solutions.learning.management.dto.accessTO.UserAccessTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/02/2020
 */
@Mapper
public interface IUserAccessMapper extends IDomainMapper<UserAccess, UserAccessTO> {
    @Override
    UserAccessTO toDTO(UserAccess domain);
    @Override
    UserAccess toDomain(UserAccessTO dto);
    @Override
    List<UserAccessTO> toPageDTO(List<UserAccess> items);
}
