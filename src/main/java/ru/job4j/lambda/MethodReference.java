package ru.job4j.lambda;

import java.util.function.Consumer;

//Написать два consumer первый обращается к нестатическому методу, а второй к статическому
public class MethodReference {
    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance; //обращение к методу через объект класса
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass; //обращение к методу через имя класса
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }

}
