package com.softserve.academy.homework9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMerger {
    public static List<Person> mergeAndSortPersons(List<Person> list1, List<Person> list2) {
        List<Person> merged = new ArrayList<>();

        if (list1 == null) list1 = new ArrayList<>();
        if (list2 == null) list2 = new ArrayList<>();

        for (Person p : list1) {
            if (!merged.contains(p)) {
                merged.add(p);
            }
        }

        for (Person p : list2) {
            if (!merged.contains(p)) {
                merged.add(p);
            }
        }

        Collections.sort(merged, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        return merged;
    }

    public static List<Person> filterByMinimumAge(List<Person> persons, int minAge) {
        List<Person> result = new ArrayList<>();

        if (persons == null) {
            return result;
        }

        for (Person p : persons) {
            if (p.getAge() >= minAge) {
                result.add(p);
            }
        }

        return result;
    }

    public static double calculateAverageAge(List<Person> persons) {
        if (persons == null || persons.isEmpty()) {
            return 0;
        }

        int totalAge = 0;
        for (Person p : persons) {
            totalAge += p.getAge();
        }

        return (double) totalAge / persons.size();
    }
}
