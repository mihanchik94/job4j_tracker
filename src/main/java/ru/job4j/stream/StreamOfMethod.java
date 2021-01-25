package ru.job4j.stream;

// Необходимо создать стрим из символов 'a', 'b', 'c'

import java.util.stream.Stream;

public class StreamOfMethod {
    public static Stream<Character> createStream() {
       return Stream.of('a', 'b', 'c');
    }
}
