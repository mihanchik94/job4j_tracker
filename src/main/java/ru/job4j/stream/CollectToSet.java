package ru.job4j.stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Чтобы собрать данные в сет, мы можем использовать методы collect() и Collectors.toSet().
//Сборка идет в HashSet
//Например,
//Set<Integer> result = Set.of(1, 2).stream().collect(Collectors.toSet());
//Необходимо собрать переданный стрим в сет

public class CollectToSet {
    public static Set<Integer> collect(Stream<Integer> data) {
     return data.collect(Collectors.toSet());
    }
}
