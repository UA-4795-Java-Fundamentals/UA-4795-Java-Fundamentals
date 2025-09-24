package com.softserve.academy.homework4;

import java.util.Scanner;

enum Season {
    WINTER("Winter", "Winter Exam Session"),
    SPRING("Spring", "Second Semester"),
    SUMMER("Summer", "Summer Break"),
    AUTUMN("Autumn", "First Semester");

    private final String name;
    private final String academicPeriod;

    Season(String name, String academicPeriod) {
        this.name = name;
        this.academicPeriod = academicPeriod;
    }

    public String getEnglishName() {
        return name;
    }

    public String getAcademicPeriod() {
        return academicPeriod;
    }
}

class Faculty {
    private String name;
    private int numberOfStudents;
    private Season season;

    public Faculty(String name, int numberOfStudents, Season season) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty: " + this.name +
                "\nNumber of students: " + numberOfStudents +
                "\nSeason: " + season.getAcademicPeriod();
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the faculty name: ");
        String facultyName = input.nextLine();
        System.out.print("Input the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Input the current season(e.g., by typing SPRING): ");
        String currentSeason = input.next().toUpperCase();

        Faculty falculty = new Faculty(facultyName, numberOfStudents, Season.valueOf(currentSeason));
        System.out.println(falculty.toString());
    }
}
