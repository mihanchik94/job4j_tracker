package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] first = left.split("/");
        String[] second = right.split("/");
        int rsl = second[0].compareTo(first[0]);
        return rsl == 0 ? left.compareTo(right) : rsl;
    }
}
