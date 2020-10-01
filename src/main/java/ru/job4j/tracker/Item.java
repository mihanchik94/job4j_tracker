package ru.job4j.tracker;

import java.util.Objects;
import java.util.StringJoiner;

public class Item implements Comparable<Item> {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name=" + name + "'").toString();
    }

    @Override
    public int compareTo(Item another) {
        return Integer.compare(id, another.id);
    }
}