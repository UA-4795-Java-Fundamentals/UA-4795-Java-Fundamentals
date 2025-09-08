package com.softserve.academy.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        for(int i = 0; i < people.length; i++){
            people[i] = new Person();
            people[i].input();
            System.out.println("");
        }
        System.out.println("People:\n");
        for (Person person : people) {
            person.output();
        }
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 1900;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 2005;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }
    
    public void output() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Age: " + this.getAge());
    }
}
