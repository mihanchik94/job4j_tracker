package ru.job4j.lambda;


import java.util.List;
import java.util.Optional;

//Написать метод поиска строки среди списка строк. Если значение найдено,
// нужно вернуть Optional из этого значения, в противном случае вернуть пустой Optional
public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> result = Optional.empty();
        for (String str: strings) {
            if (str.equals(value)) {
               result = Optional.of(str);
               break;
            }
        }
        return result;
    }
    //Возможен вариант:
    //if (strings.contains(value)) {
    //return Optional.of(value);

}
