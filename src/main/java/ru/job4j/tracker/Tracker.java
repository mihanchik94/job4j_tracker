package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;


    // Добавление заявок
    public Item add(Item item) {
        item.setId(generateId());
        items[size++] = item;
        return item;
    }

    // Получение списка всех заявок
    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int position = 0;
        for (int index = 0; index < size; index++) {
            Item item = itemsWithoutNull[index];
            if (item != null) {
              itemsWithoutNull[position] = item;
              position++;
           }
        }
        return Arrays.copyOf(itemsWithoutNull, position);
    }

    // Получение списка заявок по имени
    public Item[] findByName(String key) {
        Item[] itemsByName = new Item[size];
        int position = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                items[index] = itemsByName[position];
                position ++;
            }
        }
        return Arrays.copyOf(itemsByName, position);
    }



    // Получение заявки по id
    public Item findById(String id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId().equals(id)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    private String generateId() {
        return String.valueOf(ids++);
    }

}