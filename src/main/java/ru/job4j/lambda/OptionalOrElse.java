package ru.job4j.lambda;

import java.util.Optional;

// Задача отрефакторить код с использованием метода OrElse
//старый код:
// public static Integer orElse(Optional<Integer> optional) {
//  Integer value = -1;
//   if (optional.isPresent()) {
//   value = optional.get();
//   }
//   return value;
//  }

public class OptionalOrElse {
    public static Integer orElse(Optional<Integer> optional) {
        return optional.orElse(-1);
    }
}
