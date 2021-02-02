package ru.job4j.stream;

//Для сборки текста используется StringJoiner, или StringBuilder. Стримы также позволяют сложить элементы если они являются строками в единый текст.
//Для этого используется метод collect() и Collectors.joining(). Метод joining() принимает те же аргументы, что и StringJoiner
//Пример,
//List.of("A", "B", "C").stream().collect(Collectors.joining(System.lineSeparator()));
//Получим
//A
//B
//C
//Необходимо собрать строки списка в текст и добавить префик "Prefix", и суффикc "Suffix"
//(т.е. нужно использовать перегруженный вариант joining()). Разделителем должен быть System.lineSeparator()

import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
    public static String join(List<String> strings) {
     return strings.stream().collect(Collectors.joining(System.lineSeparator(), "Prefix", "Suffix"));
    }

}
