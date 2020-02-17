package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerRegistrationTO;
import com.caltech.solutions.learning.management.service.LearnerRegistrationService;
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
@RequestMapping("/learner-registrations")
@Api(value="Leaner Registration Resource", tags="Leaner Registration Resource")
public class LearnerRegistrationResource extends AbstractResource<LearnerRegistrationTO, String> {
    protected LearnerRegistrationResource(final LearnerRegistrationService learnerRegistrationService) {
        super(learnerRegistrationService);
    }
}
