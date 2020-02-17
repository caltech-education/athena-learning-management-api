package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.library.Book;
import com.caltech.solutions.learning.management.dto.libraryTO.BookTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface IBookMapper extends IDomainMapper<Book, BookTO> {
    @Override
    BookTO toDTO(final Book domain);
    @Override
    Book toDomain(final BookTO dto);
    @Override
    List<BookTO> toPageDTO(final List<Book> items);
}
