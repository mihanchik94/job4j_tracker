package ru.job4j.stream;

//Стримы целых чисел (IntStream, LongSteam) имеют еще один способ создания стрима.
// Это методы range(int start, int end) и rangeClosed(int start, int end)
//Первый метод, создает стрим в диапозоне [start, end)
//Второй метод, создает стрим в диапозоне [start, end]
//Например,
//IntStream.range(1, 5) => [1, 2, 3, 4]
//IntStream.rangeClosed(1, 5) => [1, 2, 3, 4, 5]
//Необходимо создать стрим с использованием метода rangeClosed()


import java.util.stream.IntStream;

public class RangeMethod {
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }

}
