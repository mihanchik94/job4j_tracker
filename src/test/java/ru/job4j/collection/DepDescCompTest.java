package ru.job4j.collection;

import org.junit.Test;
import static org.junit.Assert.*;

public class DepDescCompTest {

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare("K2", "K2/SK1");
        assertTrue(rsl < 0);
    }

    @Test
    public void whenUpDepartmentGoAfter() {
        int rsl = new DepDescComp().compare("K2/SK1", "K2");
        assertTrue(rsl > 0);
    }

    @Test
    public void whenDifferentDepartmentUp() {
        int rsl = new DepDescComp().compare("K1/SK1", "K2/SK2");
        assertTrue(rsl > 0);
    }

    @Test
    public void whenDifferentDepartmentDown() {
        int rsl = new DepDescComp().compare("K2/SK2/SSK1", "K1/SK2");
        assertTrue(rsl < 0);
    }
}