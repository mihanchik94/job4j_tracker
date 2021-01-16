package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionPowTest {

    @Test
    public void test() {
        assertEquals(4, FunctionPow.calculate(2), 0.01);
        assertEquals(25, FunctionPow.calculate(5), 0.01);
    }
}