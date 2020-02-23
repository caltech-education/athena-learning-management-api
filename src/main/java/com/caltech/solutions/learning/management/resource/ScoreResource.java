package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.subjectTO.ScoreTO;
import com.caltech.solutions.learning.management.service.ScoreService;
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
@RequestMapping("/scores")
@Api(value="Score Resource", tags="Score Resource")
public class ScoreResource extends AbstractResource<ScoreTO, String> {
    protected ScoreResource(final ScoreService scoreService) {
        super(scoreService);
    }
}
