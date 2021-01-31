package ru.job4j.stream;

//Методы toList(), toSet() формируют нам уже заданную коллекцию. toList() создает ArrayList, toSet() создает HashSet.
//Если нужно использовать заданную нами коллекцию мы можем использовать методы collect() и Collectors.toCollection()
//Например,
//List<Integer> result = List.of(1, 2).stream().collect(Collectors.toCollection(LinkedList::new));
//В качестве аргумента мы указываем создание пустой коллекции, в которую будут собираться наши значение.
//В пример, выше мы получим реализацию List, но только теперь LinkedList.
//Необходимо создать из стрима коллекцию LinkedHashSet

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToAnyCollection {
    public static Set<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toCollection(LinkedHashSet::new));
    }

}
