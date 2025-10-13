package homework11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Task1 {

    public void union(Set set1, Set set2) {
        Set<Objects> un = new HashSet<>(set1);
        un.addAll(set2);
        System.out.println(un);
    }
    public void intersect(Set set1, Set set2) {
        Set<Objects> in = new HashSet<>(set1);
        in.retainAll(set2);
        System.out.println(in);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(7);
        set1.add(5);

        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);

        System.out.println("list1: " + set1);
        System.out.println("list2: " + set2);
        Task1 t1 = new Task1();
        System.out.print("Union: ");
        t1.union(set1, set2);
        System.out.print("Intersect: ");
        t1.intersect(set1, set2);

    }
}
