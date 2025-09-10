package com.softserve.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter year of birth: ");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName + " Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) {
            this.firstName = fn;
        }
        if (ln != null && !ln.isEmpty()) {
            this.lastName = ln;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println("Enter info for person 1:");
        person1.input();
        System.out.println("Enter info for person 2:");
        person2.input();
        System.out.println("Enter info for person 3:");
        person3.input();
        System.out.println("Enter info for person 4:");
        person4.input();
        System.out.println("Enter info for person 5:");
        person5.input();

        System.out.println("List of people:");
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

        // Example to change name:
        System.out.println("Update name of person 1...");
        person1.changeName("UpdatedFirstName", "UpdatedLastName");
        person1.output();
    }
}
