package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Students2MapTest {

    @Test
    public void convertToMap() {
        List<Student> students = List.of(
                new Student("Денисов", 14),
                new Student("Иванов", 17),
                new Student("Васякин", 13));
        Map<String, Student> result = Students2Map.convert(students);
        Map<String, Student> expected = Map.of(
                "Денисов", new Student("Денисов", 14),
                "Иванов", new Student("Иванов", 17),
                "Васякин", new Student("Васякин", 13));
        assertThat(result, is(expected));
    }

    @Test
    public void whenDuplicate() {
        List<Student> students = List.of(
                new Student("Денисов", 14),
                new Student("Иванов", 17),
                new Student("Денисов", 14),
                new Student("Васякин", 13));
        Map<String, Student> result = Students2Map.convert(students);
        Map<String, Student> expected = Map.of(
                "Денисов", new Student("Денисов", 14),
                "Иванов", new Student("Иванов", 17),
                "Васякин", new Student("Васякин", 13));
        assertThat(result, is(expected));
    }

}