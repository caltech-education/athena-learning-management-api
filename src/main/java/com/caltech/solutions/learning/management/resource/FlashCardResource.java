package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.flashcardTO.FlashCardTO;
import com.caltech.solutions.learning.management.service.FlashCardService;
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
@RequestMapping("/flash-cards")
@Api(value="Flash Card Resource", tags="Flash Card Resource")
public class FlashCardResource extends AbstractResource<FlashCardTO, String> {
    protected FlashCardResource(final FlashCardService flashCardService) {
        super(flashCardService);
    }
}
