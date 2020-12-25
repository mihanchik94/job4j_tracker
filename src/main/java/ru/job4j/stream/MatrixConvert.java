package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixConvert {
    public List<Integer> convertToList(Integer[][] array) {
      return Stream.of(array)
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.toList());
    }



}
