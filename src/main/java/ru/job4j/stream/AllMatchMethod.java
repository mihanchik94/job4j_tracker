package ru.job4j.stream;

import java.util.List;

/**Чтобы проверить, что элементы стрим удовлетворяют определенному условию мы можем использовать метод allMatch()
 *Необходимо проверить, что переданный список содержит строки длина, которых больше 3
 */

public class AllMatchMethod {
    public static boolean check(List<String> str) {
        return str.stream().allMatch(s -> s.length() > 3);
    }


}
