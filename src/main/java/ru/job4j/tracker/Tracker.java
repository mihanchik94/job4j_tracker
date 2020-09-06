package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;


    // присвоение номеров (id) заявок
    private String generateId() {
        return String.valueOf(ids++);
    }

    // Добавление заявок
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    // Получение списка всех заявок
    public List<Item> findAll() {
        return items;
    }

    // Получение списка заявок по имени
    public List<Item> findByName(String key) {
        List<Item> itemsByName = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                itemsByName.add(item);}
        }
        return itemsByName;
    }

    // получение индекса по id
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
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
        return index != -1 ? items.get(index) : null;
    }

    // метод замены заявки
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        item.setId(id);
        this.items.set(index, item);
        return true;
    }

    // метод удаления заявки
    public boolean delete(String id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            this.items.remove(index);
            rsl = true;
        }
        return rsl;
        }
    }