import java.util.List;
import java.util.Map;

public class Student11 {
    private String name;
    private int course;

    public Student11(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

//    метод printStudents, который принимает в качестве аргументов список студентов и
//    //    целое число, представляющее номер курса.

    /// /            • Этот метод должен выводить имена студентов из списка, зачисленных на
    /// /    указанный курс, на консоль с помощью итератора.
    public static void printStudents(List<Student11> students, int course) {
        System.out.println("Students that in " + course + " course:");
        for (Student11 student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }
    //  • Кроме того, добавьте методы для сравнения студентов по имени и по курсу.
    public static boolean compareStudentsName(Student11 student1, Student11 student2) {
        return student1.name.equals(student2.name);
    }
    public static boolean compareStudentsCourse(Student11 student1, Student11 student2) {
        return student1.course == student2.course;
    }

}

//            • Кроме того, добавьте методы для сравнения студентов по имени и по курсу.
//• В методе main() создайте список с именем «students» и добавьте в него пять различных объектов Student.
//    Затем отобразите список студентов, отсортированный по имени и курсу.
    

