package homework9.task2;

import homework9.task1.FullName;
import lombok.Setter;

@Setter
public class Student extends FullName.Person implements Cloneable  {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return  "FirstName: " + getFullName().getFirstName() +
                ", LastName: " + getFullName().getLastName() +
                ", Age: " + getAge() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study in university";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
