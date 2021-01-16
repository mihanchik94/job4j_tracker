package ru.job4j.lambda;


//Написать метод indexOf(). Он ищет индекс по значению.
// Если индекс не найден, должно вернуться Optional.empty(). Если найден, то Optional из этого индекса
//В методе get() нужно вызвать метод indexOf(). Если вернулся пустой Optinal,
// то метод должен вернуть -1, в противном случае сам индекс

import java.util.Optional;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        int result = -1;
        if (indexOf(data, el).isPresent()) {
            return indexOf(data, el).get();
        }
        return result;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                return Optional.of(index);
            }
        }
        return Optional.empty();
    }

}
