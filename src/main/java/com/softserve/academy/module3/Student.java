package com.softserve.academy.module3;

import java.util.Objects;

public class Student {
    //fields
    private String firstName;
    private String lastName;
    private int age;
    private static int counter = 0;


    //constructors
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        counter++;

    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        counter = counter + 1;
    }
//

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        counter++;
    }

    //methods
    public boolean passExam(String subj) {
        //some logic
        return false;
    }

    public static int sumTwoNumbers(int a, int b) {
        return a + b;
    }

    public void printInfo() {
        System.out.println("I'm " + firstName + " " + lastName + " and my age is " + age);

    }

    public String getFirstName() {

        return firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public static void print() {
        System.out.println(Student.class);
        System.out.println(counter);
    }

//    public static void main(String[] args) {
//        Student st5 = new Student();
//        st5.firstName = "";
//        st5.printInfo();
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
