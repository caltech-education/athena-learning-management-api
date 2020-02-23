package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.institutionTO.GradeTO;
import com.caltech.solutions.learning.management.service.GradeService;
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
@RequestMapping("/grades")
@Api(value="Grade Resource", tags="Grade Resource")
public class GradeResource extends AbstractResource<GradeTO, String> {
    protected GradeResource(final GradeService gradeService) {
        super(gradeService);
    }
}
