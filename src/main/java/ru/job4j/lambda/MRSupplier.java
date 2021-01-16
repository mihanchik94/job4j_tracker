package ru.job4j.lambda;


import java.util.function.Supplier;

//Нужно вернуть Supplier, который создает пустую строку через new
public class MRSupplier {
    public static Supplier<String> supplier() {
        return String::new;
    }
}
