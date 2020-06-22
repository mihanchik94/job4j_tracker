package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("Denis");
        Tracker tr = new Tracker();
        tr.add(item);
        System.out.println(tr.findById(item.getId()));
        System.out.println(tr.findById("179d3b25"));
    }
}
