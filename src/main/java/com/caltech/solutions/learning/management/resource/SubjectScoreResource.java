package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.subjectTO.SubjectScoreTO;
import com.caltech.solutions.learning.management.service.SubjectScoreService;
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
@RequestMapping("/subjects-scores")
@Api(value="Subjects Scores Resource", tags="Subjects Scores Resource")
public class SubjectScoreResource extends AbstractResource<SubjectScoreTO, String> {
    protected SubjectScoreResource(final SubjectScoreService subjectScoreService) {
        super(subjectScoreService);
    }
}
