package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StreamNumsTest {

    @Test
    public void filterNumbers() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(-1);
        input.add(-35);
        input.add(35);
        input.add(5);
        input.add(8);
        List<Integer> result = StreamNums.filterNumbers(input);
        assertThat(result, is(new ArrayList<Integer>(List.of(35, 5, 8))));
    }
}