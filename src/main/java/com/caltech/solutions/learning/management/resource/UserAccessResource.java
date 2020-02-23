package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.accessTO.UserAccessTO;
import com.caltech.solutions.learning.management.service.UserAccessService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@CrossOrigin
@RestController
@RequestMapping("/user-accesses")
@Api(value="User Access Resource", tags="User Access Resource")
public class UserAccessResource extends AbstractResource<UserAccessTO, String> {
    protected UserAccessResource(final UserAccessService userAccessService) {
        super(userAccessService);
    }
}
