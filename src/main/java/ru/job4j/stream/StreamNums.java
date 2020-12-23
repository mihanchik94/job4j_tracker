package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNums {
    public static List<Integer> filterNumbers(ArrayList<Integer> nums) {
        return nums.stream().filter(integer -> integer > 0).collect(Collectors.toList());
    }
}
