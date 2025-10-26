package com.softserve.academy.homework9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMerger {
    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {
        List<String> merged = new ArrayList<>();

        if (list1 == null) {
            list1 = new ArrayList<>();
        }
        if (list2 == null) {
            list2 = new ArrayList<>();
        }

        for (String item : list1) {
            if (!merged.contains(item)) {
                merged.add(item);
            }
        }

        for (String item : list2) {
            if (!merged.contains(item)) {
                merged.add(item);
            }
        }

        Collections.sort(merged);
        return merged;
    }
}
