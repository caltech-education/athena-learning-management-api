package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.quizTO.QuizAnswerDTO;
import com.caltech.solutions.learning.management.service.QuizAnswerService;
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
@RequestMapping("/quiz-answers")
@Api(value="Quiz Answer Resource", tags="Quiz Answer Resource")
public class QuizAnswerResource extends AbstractResource<QuizAnswerDTO, String> {
    protected QuizAnswerResource(final QuizAnswerService quizAnswerService) {
        super(quizAnswerService);
    }
}
