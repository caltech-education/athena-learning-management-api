package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.institutionTO.SubjectOfferTO;
import com.caltech.solutions.learning.management.service.SubjectOfferService;
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
@RequestMapping("/subjects-offered")
@Api(value="Subjects offered Resource", tags="Subjects offered Resource")
public class SubjectOfferResource extends AbstractResource<SubjectOfferTO, String> {
    protected SubjectOfferResource(final SubjectOfferService subjectOfferService) {
        super(subjectOfferService);
    }
}
