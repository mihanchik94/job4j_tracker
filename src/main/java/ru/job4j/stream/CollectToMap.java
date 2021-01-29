package ru.job4j.stream;


//Чтобы собрать данные в мап, мы можем использовать методы collect() и Collectors.toMap().
//Сборка идет в HashMap
//Например,
//Map<Integer, Integer> result = Set.of(1, 2).stream().collect(Collectors.toMap(k -> k, v -> v));
//В качестве первого аргумента мы указываем, как мы будет строить ключ из элемента стрима,
//а в качестве второго как будем строить значение. В примере, ключом и значением будет сам элемент.
//Нужно собрать переданный стрим чисел в мап, где ключ сам элемент, а значение - его квадрат

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v));
    }

}
