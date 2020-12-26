package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemSorterTest {

    @Test
    public void testSortUp() {
        ItemSorter sorter = new ItemSorter();
        Item first = new Item(2, "Denis");
        Item second = new Item(1, "Igor");
        Item third = new Item(3, "George");
        List<Item> items = List.of(first, second, third);
        assertThat(sorter.sortUp(items), is(List.of(second, first, third)));

    }

    @Test
    public void testSortDown() {
        ItemSorter sorter = new ItemSorter();
        Item first = new Item(2, "Denis");
        Item second = new Item(1, "Igor");
        Item third = new Item(3, "George");
        List<Item> items = List.of(first, second, third);
        assertThat(sorter.sortDown(items), is(List.of(third, first, second)));
    }

    @Test
    public void testSortItemsByName() {
        ItemSorter sorter = new ItemSorter();
        Item first = new Item(2, "Denis");
        Item second = new Item(1, "Igor");
        Item third = new Item(3, "George");
        List<Item> items = List.of(first, second, third);
        assertThat(sorter.sortItemsByName(items), is(List.of(first, third, second)));
    }
}