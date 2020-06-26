package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
        System.out.print("Select: ");
        int select = Integer.valueOf(scanner.nextLine());
        if (select == 0) {
            System.out.println("=== Create a new Item ====");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            Item item = new Item(name);
            tracker.add(item);
        } else if (select == 1) {
            System.out.println("=== Show all items ====");
            Item[] items = tracker.findAll();
            if (items.length == 0) {
                System.out.println("Заявки отсутствуют");
            } else
            for (Item item : items) {
                if (item != null) {
                    System.out.println("ID заявки: " + item.getId() + "Имя заявки: " + item.getName());
                }
            }
        } else if (select == 2) {
            System.out.println("=== Edit item ====");
            System.out.println("Введите ID заявки, которую вы хотите отредактировать");
            String id = scanner.nextLine();
            System.out.println("Введите новое имя заявки");
            String name = scanner.nextLine();
            Item item = new Item(name);
            if (tracker.replace(id, item)) {
                System.out.println("Заявка успешно отредактирована");
            } else
                System.out.println("Указанный номер ID не найден");
        } else if (select == 3) {
            System.out.println("=== Delete item ====");
            System.out.println("Введите ID заявки, которую вы хотите удалить");
            String del = scanner.nextLine();
            if (tracker.delete(del)) {
                System.out.println("Заявка успешно удалена");
            } else
                System.out.println("Указанный номер ID не найден");
        } else if (select == 4) {
            System.out.println("=== Find item by Id ====");
            System.out.println("Введите ID заявки, которую вы хотите найти");
            String byId = scanner.nextLine();
            Item item = tracker.findById(byId);
            if (item != null) {
                System.out.println(" ID заявки: " + item.getId() + " Имя заявки: " + item.getName());
            } else System.out.println("Указанный номер ID не найден");
        } else if (select == 5) {
            System.out.println("=== Find items by name ====");
            System.out.println("Введите имя заявки, которую вы хотите найти");
            String byName = scanner.nextLine();
            Item[] items = tracker.findByName(byName);
            if (items.length == 0) {
                System.out.println("Заявки не найдены");
            } else
            for (Item item : items) {
                System.out.println("ID заявки: " + item.getId() + "Имя заявки: " + item.getName());
            }
        } else if (select == 6) {
            run = false;
        }
    }
}

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}