package com.wxc.edu.lab.domain;

import java.util.List;

public class WeekSchedule {

    private List<DaySegment> daySegments;

    public List<DaySegment> getDaySegments() {
        return daySegments;
    }

    public void setDaySegments(List<DaySegment> daySegments) {
        this.daySegments = daySegments;
    }

    @Override
    public String toString() {
        return "WeekSchedule{" +
                "daySegments=" + daySegments +
                '}';
    }
}
