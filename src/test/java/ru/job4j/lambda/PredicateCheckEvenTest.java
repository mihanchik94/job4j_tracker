package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCheckEvenTest {

    @Test
    public void whenEvenTest() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(3));
    }
}