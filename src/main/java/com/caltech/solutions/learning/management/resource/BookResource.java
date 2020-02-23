package com.caltech.solutions.learning.management.resource;

import caltech.data.mongo.utilities.abstracts.AbstractResource;
import com.caltech.solutions.learning.management.dto.libraryTO.BookTO;
import com.caltech.solutions.learning.management.service.BookService;
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
@RequestMapping("/books")
@Api(value="Book Resource", tags="Book Resource")
public class BookResource extends AbstractResource<BookTO, String> {
    protected BookResource(final BookService bookService) {
        super(bookService);
    }
}
