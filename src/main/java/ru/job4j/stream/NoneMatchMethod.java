package ru.job4j.stream;

import java.util.List;

/**Чтобы проверить, что ни один элемент стрима не удовлетворяет условию можно использовать метод noneMatch()
 *Необходимо проверить, что в списке нет пустых строк
 */

public class NoneMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().noneMatch(s -> s.equals(""));
    }
}
