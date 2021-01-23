package ru.job4j.stream;

//В Stream есть метод reduce(BinaryOperator<T> operator). Этот метод находит первый элемент стрима,
// он становится результатом, а потом уже начинает применять оператор к последующим элементам.
//Пример,
//Integer sum = List.of(1, 2, 3).stream().reduce((n1, n2) -> n1 + n2).get(); // сумма 6
//Integer sum = List.of(1).stream().reduce((n1, n2) -> n1 + n2).get(); // сумма 1, т.к. найдем только один элемент
//Необходимо найти произведение чисел, используя данный метод. Размер списка всегда больше 0

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce((n1, n2) -> n1 * n2).get();
    }
}
