package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.institutionTO.GradeTO;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerStatisticsTO;
import com.caltech.solutions.learning.management.service.GradeService;
import com.caltech.solutions.learning.management.service.LearnerRegistrationService;
import com.caltech.solutions.learning.management.service.LearnerStatisticsService;
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
@RequestMapping("/learner-statistics")
@Api(value="Learner Statistics Resource", tags="Learner Statistics Resource")
public class LearnerStatisticsResource extends AbstractResource<LearnerStatisticsTO, String> {
    protected LearnerStatisticsResource(final LearnerStatisticsService learnerStatisticsService) {
        super(learnerStatisticsService);
    }
}
