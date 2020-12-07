package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lmbd {
    public static void main(String[] args) {
        String[] strings = {
                "Second",
                "First",
                "Third"
        };
        Comparator<String> cmp = (left, right) -> {
            System.out.println("compare: " + left + " and " + right);
            return left.compareTo(right);
        };
        Arrays.sort(strings, cmp);
        for (String str : strings) {
            System.out.println(str);
        }
        Comparator<String> cmpReverse = (left, right) -> {
            System.out.println("compare reverse: " + left + " and " + right);
            return right.compareTo(left);
        };
        Arrays.sort(strings, cmpReverse);
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
