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
                new Student(14, "Денисов"),
                new Student(17, "Иванов"),
                new Student(13, "Васякин"));
        Map<String, Student> result = Students2Map.convert(students);
        Map<String, Student> expected = Map.of(
                "Денисов", new Student(14, "Денисов"),
                "Иванов", new Student(17, "Иванов"),
                "Васякин", new Student(13, "Васякин"));
        assertThat(result, is(expected));
    }

    @Test
    public void whenDuplicate() {
        List<Student> students = List.of(
                new Student(14, "Денисов"),
                new Student(17, "Иванов"),
                new Student(14, "Денисов"),
                new Student(13, "Васякин"));
        Map<String, Student> result = Students2Map.convert(students);
        Map<String, Student> expected = Map.of(
                "Денисов", new Student(14, "Денисов"),
                "Иванов", new Student(17, "Иванов"),
                "Васякин", new Student(13, "Васякин"));
        assertThat(result, is(expected));
    }

}