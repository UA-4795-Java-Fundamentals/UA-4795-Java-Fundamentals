package com.softserve.academy.homework12;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListFlattener {
    public static List<Integer> flatten(List<List<Integer>> nestedList) {
        if (nestedList == null || nestedList.isEmpty()) {
            return Collections.emptyList();
        }

        return nestedList.stream()
                .filter(Objects::nonNull)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
