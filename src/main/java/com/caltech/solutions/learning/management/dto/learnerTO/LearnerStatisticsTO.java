package com.caltech.solutions.learning.management.dto.learnerTO;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;
import com.caltech.solutions.learning.management.dto.libraryTO.BookTO;
import com.caltech.solutions.learning.management.dto.periodTO.LearningPeriodTO;
import com.caltech.solutions.learning.management.dto.subjectTO.SubjectScoreTO;

import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 04/02/2020
 */
public class LearnerStatisticsTO extends AbstractDataTransferObject {
    private LearnerTO learnerTO;
    private LearningPeriodTO learningPeriod;
    private Set<SubjectScoreTO> scores;
    private Set<AttendanceTO> attendanceTOS;
    private Set<BookTO> booksRead;

    public LearnerStatisticsTO() {}

    public LearnerTO getLearnerTO() {
        return learnerTO;
    }

    public LearnerStatisticsTO setLearnerTO(final LearnerTO learnerTO) {
        this.learnerTO = learnerTO;
        return this;
    }

    public LearningPeriodTO getLearningPeriod() {
        return learningPeriod;
    }

    public LearnerStatisticsTO setLearningPeriod(final LearningPeriodTO learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public Set<SubjectScoreTO> getScores() {
        return scores;
    }

    public LearnerStatisticsTO setScores(final Set<SubjectScoreTO> scores) {
        this.scores = scores;
        return this;
    }

    public Set<AttendanceTO> getAttendanceTOS() {
        return attendanceTOS;
    }

    public LearnerStatisticsTO setAttendanceTOS(final Set<AttendanceTO> attendanceTOS) {
        this.attendanceTOS = attendanceTOS;
        return this;
    }

    public Set<BookTO> getBooksRead() {
        return booksRead;
    }

    public LearnerStatisticsTO setBooksRead(final Set<BookTO> booksRead) {
        this.booksRead = booksRead;
        return this;
    }
}
