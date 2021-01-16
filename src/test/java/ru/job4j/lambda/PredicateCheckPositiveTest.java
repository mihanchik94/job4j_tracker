package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCheckPositiveTest {

    @Test public void whenPositiveTest() {
        assertTrue(PredicateCheckPositive.check(0));
        assertTrue(PredicateCheckPositive.check(1));
        assertFalse(PredicateCheckPositive.check(-1));

    }

}