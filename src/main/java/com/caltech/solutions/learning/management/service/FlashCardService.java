package com.caltech.solutions.learning.management.service;

import caltech.data.mongo.utilities.abstracts.AbstractService;
import com.caltech.solutions.learning.management.dto.flashcardTO.FlashCardTO;
import com.caltech.solutions.learning.management.mapper.IFlashCardMapper;
import com.caltech.solutions.learning.management.repository.IFlashCardRepository;
import org.springframework.stereotype.Service;

/**
 * @author Weverton Souza.
 * Created on 10/02/2020
 */
@Service
public class FlashCardService extends AbstractService<FlashCardTO, String> {
    protected FlashCardService(final IFlashCardRepository repository, final IFlashCardMapper mapper) {
        super(repository, mapper);
    }
}
