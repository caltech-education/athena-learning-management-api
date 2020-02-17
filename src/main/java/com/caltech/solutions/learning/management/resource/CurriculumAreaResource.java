package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.subjectTO.CurriculumAreaTO;
import com.caltech.solutions.learning.management.service.CurriculumAreaService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@CrossOrigin
@RestController
@RequestMapping("/curriculum-area")
@Api(value="Curriculum Area Resource", tags="Curriculum Area Resource")
public class CurriculumAreaResource extends AbstractResource<CurriculumAreaTO, String> {
    protected CurriculumAreaResource(final CurriculumAreaService curriculumAreaService) {
        super(curriculumAreaService);
    }
}
