package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNums {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(-35);
        nums.add(35);
        nums.add(5);
        nums.add(8);
        List<Integer> numbers = nums.stream().filter(integer -> integer > 0).collect(Collectors.toList());
        numbers.forEach(System.out::println);
    }
}
