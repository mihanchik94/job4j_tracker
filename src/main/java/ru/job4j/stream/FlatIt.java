package ru.job4j.stream;

//Даны вложенные итераторы.
// Нужно написать метод, который соберет все элементы их итераторов в List.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> result = new ArrayList();
        while (it.hasNext()) {
            Iterator<Integer> iterator = it.next();
            while (iterator.hasNext()) {
                result.add(iterator.next());
            }
        }
        return result;
    }

}
