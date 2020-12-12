package ru.job4j.lambda;

import org.junit.Test;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FunctionCountingTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionCounting.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        List<Double> result = FunctionCounting.diapason(5, 8, x -> 2 * Math.pow(x, 2) + 1);
        List<Double> expected = Arrays.asList(51D, 73D, 99D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunction() {
        List<Double> result = FunctionCounting.diapason(5, 8, x -> 2 * Math.pow(x, x) + 1);
        List<Double> expected = Arrays.asList(6251D, 93313D, 1647087D);
        assertThat(result, is(expected));
    }
}