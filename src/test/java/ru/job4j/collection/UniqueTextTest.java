package ru.job4j.collection;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniqueTextTest {
    @Test
    public void testIsEquals() {
        String origin = "My cat eats a mouse and milk";
        String text = "My cat eats a milk and mouse";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    @Test
    public void testIsNotEquals() {
        String origin = "My cat eats a mouse";
        String text = "Mouse was eaten by my cat";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
}