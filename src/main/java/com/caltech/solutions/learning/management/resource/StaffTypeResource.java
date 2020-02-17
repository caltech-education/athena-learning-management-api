package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.staffTO.StaffTO;
import com.caltech.solutions.learning.management.service.StaffService;
import com.caltech.solutions.learning.management.service.StaffTypeService;
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
@RequestMapping("/staff-types")
@Api(value="Staff Type Resource", tags="Staff Type Resource")
public class StaffTypeResource extends AbstractResource<StaffTO, String> {
    protected StaffTypeResource(final StaffTypeService staffTypeService) {
        super(staffTypeService);
    }
}
