package com.softserve.academy.homework10.Task2;

import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void promoteToNextCourse() {
        course++;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", avg=" + this.getAverageGrade();
    }
}
