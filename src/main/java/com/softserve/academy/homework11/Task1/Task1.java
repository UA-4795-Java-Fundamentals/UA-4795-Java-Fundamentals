package com.softserve.academy.homework11.Task1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2: " + set2);
        System.out.println("Set2: " + set2);
        System.out.println("union: " + union(set1, set2));
        System.out.println("intersect" + intersect(set1, set2));
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<T>(set1);
        result.addAll(set2);

        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<T>(set1);
        result.retainAll(set2);

        return result;
    }
}
