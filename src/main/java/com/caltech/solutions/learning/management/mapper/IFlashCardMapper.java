package com.caltech.solutions.learning.management.mapper;

import caltech.data.mongo.utilities.interfaces.IDomainMapper;
import com.caltech.solutions.learning.management.domain.flashcard.FlashCard;
import com.caltech.solutions.learning.management.dto.flashcardTO.FlashCardTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 07/01/2020
 */
@Mapper
public interface IFlashCardMapper extends IDomainMapper<FlashCard, FlashCardTO> {
    @Override
    FlashCardTO toDTO(final FlashCard domain);
    @Override
    FlashCard toDomain(final FlashCardTO dto);
    @Override
    List<FlashCardTO> toPageDTO(final List<FlashCard> items);
}
