package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.libraryTO.BookTO;
import com.caltech.solutions.learning.management.mapper.IBookMapper;
import com.caltech.solutions.learning.management.repository.IBookRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class BookService extends AbstractService<BookTO, String> {
    protected BookService(final IBookRepository repository, final IBookMapper mapper) {
        super(repository, mapper);
    }
}
