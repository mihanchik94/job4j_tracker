package ru.job4j.lambda;

import java.util.function.Function;

//Нужно извлечь квадратный корень из числа
public class FunctionSqrt {
    public static double calculate(double num) {
        return calculate(a -> Math.sqrt(a), num); // можно сделать через ссылку на метод, вместо a -> Math.sqrt(a) прописать Math::sqrt
    }

    private static double calculate(Function<Double, Double> func, double num) {
        return func.apply(num);
    }
}
