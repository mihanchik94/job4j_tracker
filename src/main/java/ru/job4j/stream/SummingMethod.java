package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** Если нужно подсчитать сумму элементов при группировке, то можем использовать коллектор Collectors.summingInt(),
 * который принимает функцию в которой мы должны преобразовать наш объект к int
 * Например, просуммируем четные и нечетные элементы. (В примере summingInt принимает n -> n, т.к. в списке уже хранятся числа):
 * List.of(1, 2, 3, 4, 5, 6).stream()
 * .collect(Collectors.groupingBy(n -> n % 2,
 * Collectors.summingInt(n -> n)
 * )).forEach((k, v) -> System.out.println(k + " " + v));
 * // Вывод:
 * 0 12
 * 1 9
 *
 * Дан список пользователей, у каждого пользователя есть счет.
 * Необходимо найти сумму баланса для каждого пользователя.
 */


public class SummingMethod {
    public static Map<String, Integer> summing(List<User> users) {
       return users.stream()
               .collect(Collectors.groupingBy(
                       User::getName,
                       Collectors.summingInt(user -> user.getBills().stream()
                               .mapToInt(Bill::getBalance).sum()
                       )));

    }


}
