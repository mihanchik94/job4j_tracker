package ru.job4j.stream;

//*Представьте, что разработчики JDK не сделали Stream API.
//В этом задании нужно реализовать каркас упрощенного Stream API.
//EasyStream работает только с типом Integer. В нем есть четыре метода:
//of - получает исходные данные.
//map - преобразует число в другое число.
//filter - фильтрует поток элементов.
//collect - собирает все элементы из source по заданным условиям map и filter.
//В задании нужно использовать шаблон Builder.
//Реализовать класс EasyStream, проверить реализацию тестами.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private final List<Integer> source;

    private EasyStream(List<Integer> source) {
        this.source = source;
    }

    public static EasyStream of(List<Integer> source) {
        return new EasyStream(source);
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        List<Integer> list = new ArrayList<>();
        for (Integer el : source) {
            list.add(fun.apply(el));
        }
        return new  EasyStream(list);
    }

    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> list = new ArrayList<>();
        for (Integer el : source) {
            if (fun.test(el)) {
                list.add(el);
            }
        }
        return new EasyStream(list);
    }

    public List<Integer> collect() {
        return new ArrayList<>(source);
    }
}
