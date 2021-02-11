package ru.job4j.stream;

import java.util.stream.Stream;

/**Если нужно выполнить какое-то действие над каждым элементом стрима,
 *при этом нам не нужно ничего возвращать, то мы можем использовать метод forEach().
 *Необходимо вывести элементы стрима в консоль через System.out.println()
 */

public class ForEachMethod {
    public static void show(Stream<Integer> data) {
        data.forEach(System.out::println);
    }
}
