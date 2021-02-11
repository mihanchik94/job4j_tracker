package ru.job4j.stream;

import java.util.List;

/**Чтобы проверить, что хотя бы один элемент стрима удовлетворяет условию, можно использовать метод anyMatch()
 *Необходим проверить, что хотя бы в одной строке присутствует "job4j"
 */

public class AnyMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().anyMatch(s -> s.equals("job4j"));
    }
}
