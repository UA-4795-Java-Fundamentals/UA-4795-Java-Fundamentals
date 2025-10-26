package com.softserve.academy.homework9;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsFinderStarter {
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> common = new ArrayList<>();

        if (list1 == null || list2 == null || list1.isEmpty() || list2.isEmpty()) {
            return common;
        }

        for (Integer num : list1) {
            if (list2.contains(num) && !common.contains(num)) {
                common.add(num);
            }
        }

        return common;
    }

    public static Integer findMaxValue(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        Integer max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
