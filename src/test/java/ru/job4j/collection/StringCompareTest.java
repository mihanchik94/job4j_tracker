package ru.job4j.collection;


import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;;

public class StringCompareTest {
    @Test
    public void whenStringAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivanov",
                "Ivanov");
        assertThat(rsl, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultIsNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivanov",
                "Ivanova");
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultIsPositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivanova",
                "Ivanov");
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void secondCharOfLeftGreaterThanRightIsPositive(){
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightIsNegative(){
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }
}
