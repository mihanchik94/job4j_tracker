package ru.job4j.lambda;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

//Написать метод поиск строки среди списка. В списке могут быть null элементы.
//Чтобы обернуть найденное значение нужно использовать Optional.ofNullable().
//Если что-то найдено, нужно вернуть Optional из этого значения, в противном случае пустой Optional

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String str : strings) {
            if (Objects.equals(str, value)) {
                return Optional.ofNullable(str);
            }
        }
        return Optional.empty();
    }
}
