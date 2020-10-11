package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        Integer leftNum = Integer.parseInt(left.substring(0, left.indexOf(".")));
        Integer rightNum = Integer.parseInt(right.substring(0, right.indexOf(".")));
        return leftNum.compareTo(rightNum);
    }
}
