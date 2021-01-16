package ru.job4j.lambda;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

public class MRFunctionTest {

    @Test
    public void test() {
        Function<Double, Double> func = MRFunction.apply();
        assertEquals(2.0, func.apply(4.0), 0.01);
        assertEquals(5.0, func.apply(25.0), 0.01);
    }
}