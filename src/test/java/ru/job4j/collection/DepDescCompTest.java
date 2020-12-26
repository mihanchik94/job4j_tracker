package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class DepDescCompTest {

    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDifferentDepartmentUp() {
        int rsl = new DepDescComp().compare("K1/SK1", "K2/SK1");
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenDifferentDepartmentDown() {
        int rsl = new DepDescComp().compare("K2/SK2/SSK1", "K1/SK2");
        assertThat(rsl, lessThan(0));
    }

    @Test
    public  void whenSortDesc() {
        List<String> input = List.of(
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K1/SK1/SSK2",
                "K1/SK1/SSK1",
                "K1/SK2");
        List<String> expect = List.of(
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertThat(result, is(expect));

    }
}