package ru.job4j.lambda;

import java.util.function.Predicate;

//Нужно дописать лямбда выражение, которое проверяет, что число положительное

public class PredicateCheckPositive {
    public static boolean check (int num) {
        return check(a -> a >= 0, num);
    }

    public static boolean check (Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
