package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.staffTO.StaffTO;
import com.caltech.solutions.learning.management.service.StaffService;
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
@RequestMapping("/staffs")
@Api(value="Staff Resource", tags="Staff Resource")
public class StaffResource extends AbstractResource<StaffTO, String> {
    protected StaffResource(final StaffService staffService) {
        super(staffService);
    }
}
