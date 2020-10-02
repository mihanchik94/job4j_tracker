package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/*В Java есть интерфейс java.util.Set. Классы этого интерфейса - это java.util.HashSet и java.util.TreeSet.
Эти коллекции не содержат дубликатов.
java.util.TreeSet сразу сортирует элементы.*/

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(6);
        numbers.add(6);
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);

        Set<Integer> nums = new TreeSet<>(Collections.reverseOrder());
        nums.add(6);
        nums.add(4);
        nums.add(1);
        nums.add(6);
        nums.add(3);
        System.out.println(nums);
    }
}
