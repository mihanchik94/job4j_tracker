package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int chr = 0; chr < Math.min(left.length(), right.length()); chr++) {
            char first = left.charAt(chr);
            char second = right.charAt(chr);
            if (first != second) {
                return Character.compare(first, second);
            }
        }
        return left.length()-right.length();
    }
}
