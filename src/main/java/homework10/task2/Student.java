package homework10.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Iterator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public double getAverage(){
        double sum=0;
        for(Integer grade:grades){
            sum+=grade;
        }
        return sum/grades.size();
    }

    public static void removeAndPromote(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student s = iterator.next();
            double avg = s.getAverage();
            if(avg<3){
                iterator.remove();
            }else {
                s.setCourse(s.getCourse()+1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course){
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName() + ", course" + s.getCourse());
            }
        }
    }
}
