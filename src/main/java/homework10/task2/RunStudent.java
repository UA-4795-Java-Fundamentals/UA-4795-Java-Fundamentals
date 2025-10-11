package homework10.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static homework10.task2.Student.printStudents;
import static homework10.task2.Student.removeAndPromote;

public class RunStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Mike", "KN-720", 2, Arrays.asList(2, 2, 2, 2, 3, 4)),
                new Student("Max", "KN-720", 3, Arrays.asList(5, 5, 4, 3, 3)),
                new Student("Alice", "KN-721", 3, Arrays.asList(4, 4, 4, 5, 5)),
                new Student("Bob", "KN-722", 2, Arrays.asList(2, 3, 2, 2, 3))
        ));
        System.out.println("List of students:");
        System.out.println(students);
        System.out.println("Remove and Promote students: ");
        removeAndPromote(students);
        System.out.println(students);
        System.out.println("Students enrolled on next course: ");
        printStudents(students, 4);

    }
}
