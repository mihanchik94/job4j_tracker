package ru.job4j.lambda;

import java.util.function.Predicate;

//Нужно создать предикат Predicate, который проверяет, что строка пустая.
public class MRPredicate {
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}
