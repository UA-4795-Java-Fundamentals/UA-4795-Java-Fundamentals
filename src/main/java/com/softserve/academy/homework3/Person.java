package com.softserve.academy.homework3;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName, lastName;
    private Year birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = Year.now(); // default birth year
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        firstName = input.nextLine();
        System.out.print("Please enter your last name: ");
        lastName = input.nextLine();
        System.out.print("Please enter your birth year: ");
        birthYear = Year.parse(input.nextLine());
    }

    public void output() {
        System.out.printf("--Person: %s %s, age - %s.\n\n", firstName, lastName, getAge());
    }

    public void changeName(String fn, String ln) {
        if (!fn.trim().isEmpty()) // if 'fn' is empty - leave this field unchanged, same for 'ln'
            this.firstName = fn;
        if (!ln.trim().isEmpty())
            this.lastName = ln;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear.getValue();
    }
}
