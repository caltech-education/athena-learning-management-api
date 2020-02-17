package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerTO;
import com.caltech.solutions.learning.management.service.LearnerService;
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
@RequestMapping("/learners")
@Api(value="Leaner Resource", tags="Leaner Resource")
public class LearnerResource extends AbstractResource<LearnerTO, String> {
    protected LearnerResource(final LearnerService learnerService) {
        super(learnerService);
    }
}
