package com.softserve.academy.homework12;

import java.util.List;

public class LongWordCounter {
    public static long countLongWords(List<String> words) {
        if (words == null || words.isEmpty()) {
            return 0;
        }

        return words.stream()
                .filter(word -> word.length() > 5)
                .count();
    }
}
