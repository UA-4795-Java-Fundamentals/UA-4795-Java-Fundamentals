package homework11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class Student {
    private String name;
    private int course;

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName() + ", course " + student.getCourse());
            }
        }
    }

    public static Comparator<Student> compareByName = new Comparator<>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    };
    public static Comparator<Student> compareByCourse = new Comparator<>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getCourse(), s2.getCourse());
        }
    };


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 1));
        students.add(new Student("Tom", 2));
        students.add(new Student("Anne", 3));
        students.add(new Student("Mike", 1));
        students.add(new Student("Joseph", 4));

        System.out.println("Students of course 2: ");
        printStudents(students, 2);
        System.out.println("Sorted by name: ");
        students.sort(compareByName);
        System.out.println(students);
        System.out.println("Sorted by course: ");
        students.sort(compareByCourse);
        System.out.println(students);
    }

}
