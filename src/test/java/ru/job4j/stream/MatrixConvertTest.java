package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixConvertTest {

    @Test
    public void convertToList() {
        Integer[][] array = new Integer[][] {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        MatrixConvert convert = new MatrixConvert();
        List<Integer> rsl = convert.convertToList(array);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertThat(rsl, is(expected));
    }
}