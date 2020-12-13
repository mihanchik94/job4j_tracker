package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCounting {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        ArrayList<Double> result = new ArrayList<>();
        for (double i = start; i < end; i++) {
            result.add(func.apply(i));
        }
        return result;
    }
}
