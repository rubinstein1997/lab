package com.wxc.edu.lab.domain;

import java.util.List;

//描述时间段的类,例如一周所有0102节的课
public class DaySegment {

    //时间段id,如"0102"
    private String segmentId;

//    private List<Course> courses;

    //里面存储一个星期的时间段的课程信息,如monday,tuesday...,所以共有七个元素
    private List<Object> perDay;

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public List<Object> getPerDay() {
        return perDay;
    }

    public void setPerDay(List<Object> perDay) {
        this.perDay = perDay;
    }

    @Override
    public String toString() {
        return "DaySegment{" +
                "segmentId='" + segmentId + '\'' +
                ", perDay=" + perDay +
                '}';
    }
}
