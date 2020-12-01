package ru.job4j.collection;


import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        List<String> rsl = new ArrayList<>(tmp);
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    tmp.add(start += el);
                } else {
                    tmp.add(start += "/" + el);
                }
            }
        }
        rsl.addAll(tmp);
        rsl.sort(Comparator.naturalOrder());
        return rsl;
    }

    public static void sortAsc(List<String> org) {
        org.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> org) {
        org.sort(new DepDescComp());
    }
}
