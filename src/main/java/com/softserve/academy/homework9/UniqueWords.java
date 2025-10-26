package com.softserve.academy.homework9;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
    public static Set<String> collectUnique(String[] words) {
        Set<String> uniqueWords = new HashSet<>();

        if (words != null) {
            for (String word : words) {
                uniqueWords.add(word);
            }
        }

        return uniqueWords;
    }
}

