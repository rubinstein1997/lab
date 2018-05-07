package com.wxc.edu.lab.domain;

public class Course {

    private int id;

    private String teacher;

    private String courseName;

    private String className;

    private String day;

    private String week;

    private String segment;

    private String laboratory;


    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    @Override
    public String toString() {
        return "Course{" +
                "teacher='" + teacher + '\'' +
                ", courseName='" + courseName + '\'' +
                ", className='" + className + '\'' +
                ", day='" + day + '\'' +
                ", week='" + week + '\'' +
                ", segment='" + segment + '\'' +
                ", laboratory='" + laboratory + '\'' +
                '}';
    }
}
