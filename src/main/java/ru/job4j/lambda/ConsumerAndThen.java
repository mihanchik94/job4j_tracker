package ru.job4j.lambda;

import java.util.function.Consumer;

//Нужно совместить два Consumer, первый выводит строку через System.out.print,
// а второй приписывает переход на новую строку через System.out.println.

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = (x) -> System.out.print(input);
        Consumer<String> nln = (x) -> System.out.println();
        return print.andThen(nln);
    }
}
