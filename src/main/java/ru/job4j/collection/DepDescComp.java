package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        String[] first = left.split("/");
        String[] second = right.split("/");
        if (first[0].equals(second[0])) {
            rsl = left.compareTo(right);
        } else {
            rsl = right.compareTo(left);
        }
        return rsl;
    }
}
