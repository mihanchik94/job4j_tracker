package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixConvert {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][] {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        List<Integer> integers = (Stream.of(matrix)
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.toList()));
        integers.forEach(System.out::println);
    }



}
