package ru.job4j.lambda;

//Нужно написать лямбда выражение, которое будет подставлять переданное число в формулу num * num + 2 * num + 1

import java.util.function.Function;

public class FunctionFormula {
    public static double calculate(double x) {
        return calculate(num -> num * num + 2 * num + 1, x);
    }

    private static double calculate(Function<Double, Double> func, double x) {
        return func.apply(x);
    }
}
