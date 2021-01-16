package ru.job4j.lambda;


import java.util.function.Function;

//Нужно написать лямбда-выражение, которое возводит переданное число в квадрат (для 2 = 4, для 3 = 9 и тд)
public class FunctionPow {
    public static double calculate(double num) {
        return calculate(a -> Math.pow(a, 2), num);
    }

    private static double calculate(Function<Double, Double> func, double num) {
        return func.apply(num);
    }
}
