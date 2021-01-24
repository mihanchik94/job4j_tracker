package ru.job4j.stream;

//Поиск минимального элемента также представляет собой редукцию.
//Этот метод принимает Comparator и возвращает Optional. Если список пуст вернется пустой Optional.
//Задача найти строку с минимальной длиной. Размер списка больше 0

import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        return list.stream()
                .min((n1, n2) -> Integer.compare(n1.length(), n2.length()))
                .get();
    }
}
