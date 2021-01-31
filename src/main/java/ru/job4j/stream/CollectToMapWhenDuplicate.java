package ru.job4j.stream;

//Для того чтобы собрать данные в мапу в случае, если стрим содержит дубликаты,
//мы можем использовать методы collect() и Collectors.toMap(), но перегруженный. Сборка идет в HashMap.
//Например,
//Map<Integer, Integer> result = List.of(1, 2, 1).stream().collect(Collectors.toMap(k -> k, v -> v, (prev, curr) -> prev));
//В качестве первого аргумента мы указываем, как мы будем строить ключ из элемента стрима,
//а в качестве второго как будем строить значение. В качестве третьего аргументы мы указываем,
//что делать в случае дубликата ключа, оставим мы старое значение или новое.
//В примере, ключом и значением будет сам элемент, а в случае дубликата мы указываем, что останется предыдущее значение
//Необходимо собрать, переданный стрим чисел в мапу, где ключ сам элемент, а значение это его квадрат.
//Нужно использовать версию toMap() описанную в задании.

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMapWhenDuplicate {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev));
    }
}
