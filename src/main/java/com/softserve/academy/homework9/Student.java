package com.softserve.academy.homework9;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d, Course: %d",
                fullName.getFirstName(), fullName.getLastName(), age, course);
    }

    @Override
    public String activity() {
        return String.format("I study at university in the %d course", course);
    }

    @Override
    public Student clone() {
        try {
            Student cloned = (Student) super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
