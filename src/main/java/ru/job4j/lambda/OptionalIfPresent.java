package ru.job4j.lambda;

//Написать метод max(). Он находит максимальный элемент массива.
//Если массив пуст, то возвращает пустой Optional, в противном случае Optinal из максимального значения
//Метод ifPresent() вызывает метод max().Если значение существует,
// то выводит максимальное значение например, "Max: 3". Для вывода нужно использовать System.out.println()

import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        max(data).ifPresent(value -> System.out.println("Max value: " + value));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }
        int max = 0;
        for (int value : data) {
            if (max < value) {
                max = value;
            }
        }
        return Optional.of(max);
    }

}
