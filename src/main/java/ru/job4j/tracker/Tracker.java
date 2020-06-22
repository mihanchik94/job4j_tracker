package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;


    // присвоение номеров (id) заявок
    private String generateId() {
        return String.valueOf(ids++);
    }

    // Добавление заявок
    public Item add(Item item) {
        item.setId(generateId());
        items[size++] = item;
        return item;
    }

    // Получение списка всех заявок
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    // Получение списка заявок по имени
    public Item[] findByName(String key) {
        Item[] itemsByName = new Item[size];
        int position = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                items[index] = itemsByName[position];
                position++;
            }
        }
        return Arrays.copyOf(itemsByName, position);
    }

    // получение индекса по id
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    // Получение заявки по id
    public Item findById(String id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    // метод замены заявки
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items[index].getId());
            items[index] = item;
        }
        return true;
    }

    // метод удаления заявки
    public boolean delete(String id) {
        items[indexOf(id)] = null;
        return true;
    }
}