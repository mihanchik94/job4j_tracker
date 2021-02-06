package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**Метод Collectors.groupingBy() всегда первым параметром принимает функцию, по которой будет строиться ключ.
 * Вторым параметром может принимать Collector. Большинство методов Collectors возвращают Collector.
 * Метод Collectors.counting(), ничего не принимает, а просто подсчитывает количество элементов определенной группы
 * Например, напишем код, который будет возвращать Map<String, Long> ключ это строка, значение это число ее вхождений в список:
 * List<String> str = List.of("a", "b", "c", "b", "c", "c");
 * str.stream
 * .collect(Collectors.groupingBy(
 * Function.identity(),
 * Collectors.counting
 * )).foreach((k, v) -> System.out.println(k + " " + v);
 *
 * // Вывод на консоль:
 * a 1
 * b 2
 * c 3
 *
 * Необходимо подсчитать количество работников для каждой компании
 */

public class CountingMethod {
    public static Map<String, Long> groupAndCounts(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        worker -> worker.getCompany().getName(),
                        Collectors.counting()));
    }
}
