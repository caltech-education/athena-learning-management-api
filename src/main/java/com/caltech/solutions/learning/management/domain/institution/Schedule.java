package com.caltech.solutions.learning.management.domain.institution;

import com.caltech.solutions.learning.management.domain.staff.Staff;
import com.caltech.solutions.learning.management.enumeration.PeriodOfDay;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.DayOfWeek;

public class Schedule {
    @DBRef
    private Staff teacher;
    private DayOfWeek dayOfWeek;
    private PeriodOfDay periodOfDay;
    private String startHour;
    private String endHour;

    private Schedule() {}

    public Staff getTeacher() {
        return teacher;
    }

    public Schedule setTeacher(final Staff teacher) {
        this.teacher = teacher;
        return this;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public Schedule setDayOfWeek(final DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public PeriodOfDay getPeriodOfDay() {
        return periodOfDay;
    }

    public Schedule setPeriodOfDay(final PeriodOfDay periodOfDay) {
        this.periodOfDay = periodOfDay;
        return this;
    }

    public String getStartHour() {
        return startHour;
    }

    public Schedule setStartHour(final String startHour) {
        this.startHour = startHour;
        return this;
    }

    public String getEndHour() {
        return endHour;
    }

    public Schedule setEndHour(final String endHour) {
        this.endHour = endHour;
        return this;
    }
}
