package ru.job4j.collection;

import ru.job4j.tracker.Item;

import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static List<Item> sortUp(List<Item> items) {
        Collections.sort(items);
        return items;
    }

    public static List<Item> sortDown(List<Item> items) {
        Collections.sort(items, Collections.reverseOrder());
        return items;
    }

    public static List<Item> sortItemsByName(List<Item> items) {
        items.sort(new SortByNameItem());
        return items;
    }

}
