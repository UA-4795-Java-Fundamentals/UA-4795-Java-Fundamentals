package com.softserve.academy.module10;

import java.util.*;

public class DemoHashSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(Comparator.reverseOrder());
        set.add("First");
        set.add("Second");
        set.add("First");
        set.add("Third");
       // set.add(null);
        for (String item:set) {
            System.out.println(item);
        }
        System.out.println(set.size());
        System.out.println(set.contains("Third"));
        set.removeAll(Set.of("First", "Second"));
        System.out.println(set);

    }
}
