package ru.job4j.stream;

//Для представления стрима примитивов в Java есть свои классы: IntStream, LongStream, DoubleStream.
//Чаще всего приходиться создавать стрим из массива примитивов. Для этого лучше всего подходит метод Arrays.stream(). Например:
//int[] data = {1, 2, 3};
//IntStream steam = Arrays.stream(data);
//Нужно создать стрим из переданного массива

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysStreamForPrimitive {
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }

}
