package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 2, 1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Integer first = 1;
        Integer second = 2;
        int rsl = first.compareTo(second); // выводит -1, 0 или 1 в зависимости от того, меньше первое значение, равно или больше второго.
        System.out.println(rsl);

        String petr = "Petr";
        String ivan = "Ivan";
        int rslStr = petr.compareTo(ivan);
        System.out.println(rslStr);

        List<Integer> nums = Arrays.asList(5, 3, 4, 2, 1);
        System.out.println(nums);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
