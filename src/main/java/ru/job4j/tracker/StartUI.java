package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tr = new Tracker();
        tr.add(new Item("Denis"));
        System.out.println(tr.findByName("Denis"));
    }
}
