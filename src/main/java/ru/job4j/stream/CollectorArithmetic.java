package ru.job4j.stream;

//Редукция может быть использована не только для сведения в коллекцию,
// но и для сведению например, к числу, строке и тд.
// написать коллектор, который будет умножать все элементы списка

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorArithmetic {
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> sup = LinkedList::new;
        BiConsumer<List<Integer>, Integer> biConsumer = List::add;
        BinaryOperator<List<Integer>> operator = (x, y) -> {
            x.addAll(y);
            return x;
        };
        Function<List<Integer>, Integer> function = (lst) -> {
            int number = 1;
            for (Integer n : lst) {
                number *= n;
            }
            return number;
        };
        return list.stream().collect(Collector.of(sup, biConsumer, operator, function));
    }

}
