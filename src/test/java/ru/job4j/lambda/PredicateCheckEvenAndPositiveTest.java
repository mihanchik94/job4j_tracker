package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCheckEvenAndPositiveTest {

    @Test
    public void whenEvenAndPositive() {
        assertTrue(PredicateCheckEvenAndPositive.check(2));
        assertFalse(PredicateCheckEvenAndPositive.check(3));
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
    }
}