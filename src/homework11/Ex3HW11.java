import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ex3HW11 {
    //    Создайте класс с именем Student, который хранит информацию об имени студента и
//    курсе.
//• Класс должен включать свойства для доступа к этим полям, конструктор с
//    параметрами и метод printStudents, который принимает в качестве аргументов список студентов и
//    целое число, представляющее номер курса.
//            • Этот метод должен выводить имена студентов из списка, зачисленных на
//    указанный курс, на консоль с помощью итератора.
//            • Кроме того, добавьте методы для сравнения студентов по имени и по курсу.
//• В методе main() создайте список с именем «students» и добавьте в него пять различных объектов Student.
//    Затем отобразите список студентов, отсортированный по имени и курсу.
    public static void main(String[] args) {
        List<Student11> students = new ArrayList<>();
        students.add(new Student11("Alice", 1));
        students.add(new Student11("Bob", 1));
        students.add(new Student11("Frank", 2));
        students.add(new Student11("Mark", 2));
        students.add(new Student11("Davis", 3));
        Student11.printStudents(students,1);
        System.out.println(Student11.compareStudentsName(students.get(0),students.get(1)));
        System.out.println(Student11.compareStudentsCourse(students.get(0),students.get(1)));
    }
}
