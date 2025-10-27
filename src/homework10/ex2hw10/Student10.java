package ex2hw10;

import java.util.Iterator;
import java.util.List;

public class Student10 {
    private String name;
    private String group;
    private int course;
    private List<Integer> marks;

    public Student10(String name, String group, int course, List<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() { return name; }
    public String getGroup() { return group; }
    public int getCourse() { return course; }
    public List<Integer> getMarks() { return marks; }

    public void setCourse(int course) { this.course = course; }

    public double getAverageGrade() {
        return marks == null || marks.isEmpty()
                ? 0.0
                : marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public void increaseCourse() {
        this.course++;
    }

    public static void processStudents(List<Student10> students) {
        Iterator<Student10> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student10 st = iterator.next();
            if (st.getAverageGrade() < 3.0) {
                iterator.remove();
            } else {
                st.increaseCourse();
            }
        }
    }

    public static void printStudents(List<Student10> students, int course) {
        System.out.println("Студенты " + course + " курса:");
        students.stream()
                .filter(s -> s.getCourse() == course)
                .map(Student10::getName)
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return name + " | группа: " + group + " | курс: " + course + " | ср: " + String.format("%.2f", getAverageGrade());
    }
}

