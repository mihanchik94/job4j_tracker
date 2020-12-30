package ru.job4j.collection;

import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originText = origin.replaceAll("\\p{Punct}", "").split(" ");
        String[] dupleText = line.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String word : originText) {
            check.add(word);
        }
        for (String dupleWord : dupleText) {
            if (!check.contains(dupleWord)) {
               rsl = false;
               break;
            }
        }
        return rsl;
    }
}
