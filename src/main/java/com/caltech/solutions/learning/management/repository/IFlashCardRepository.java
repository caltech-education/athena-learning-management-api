package com.caltech.solutions.learning.management.repository;

import caltech.data.mongo.utilities.interfaces.IRepository;
import com.caltech.solutions.learning.management.domain.flashcard.FlashCard;
import org.springframework.stereotype.Repository;

/**
 * @author Weverton Souza.
 * Created on 07/02/2020
 */
@Repository
public interface IFlashCardRepository extends IRepository<FlashCard, String> {}

