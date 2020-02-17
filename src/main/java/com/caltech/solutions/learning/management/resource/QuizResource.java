package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.quizTO.QuizDTO;
import com.caltech.solutions.learning.management.service.QuizService;
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
@RequestMapping("/quizzes")
@Api(value="Quiz Resource", tags="Quiz Resource")
public class QuizResource extends AbstractResource<QuizDTO, String> {
    protected QuizResource(final QuizService quizService) {
        super(quizService);
    }
}
