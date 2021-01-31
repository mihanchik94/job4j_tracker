package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CollectToAnyCollectionTest {

    @Test
    public void test() {
        List<Integer> data = List.of();
        String expectCLass = "java.util.LinkedHashSet";
        String resultClass = CollectToAnyCollection.collect(data.stream()).getClass().getName();
        assertEquals(expectCLass, resultClass);
    }
}