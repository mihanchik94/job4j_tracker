package ru.job4j.tracker;


public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItems(Input input, Tracker tracker) {
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
    }

    public static void editItem(Input input, Tracker tracker){
        System.out.println("=== Edit item ====");
        String id = input.askStr("Введите ID заявки, которую вы хотите отредактировать");
        String name = input.askStr("Введите новое имя заявки");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка успешно отредактирована");
        } else
            System.out.println("Указанный ID не найден");
        }

        public static void deleteItem(Input input, Tracker tracker){
            System.out.println("=== Delete item ====");
            String del = input.askStr("Введите ID заявки, которую вы хотите удалить");
            if (tracker.delete(del)) {
                System.out.println("Заявка успешно удалена");
            } else System.out.println("Указанный ID не найден");
        }

        public static void findById(Input input, Tracker tracker){
            System.out.println("=== Find item by Id ====");
            String byId = input.askStr("Введите ID заявки, которую вы хотите найти");
            Item item = tracker.findById(byId);
            if (item != null) {
                System.out.println(" ID заявки: " + item.getId() + " Имя заявки: " + item.getName());
            } else System.out.println("Указанный номер ID не найден");
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String byName = input.askStr("Введите имя заявки, которую вы хотите найти");
        Item[] items = tracker.findByName(byName);
        if (items.length == 0) {
            System.out.println("Заявки не найдены");
        } else
            for (Item item : items) {
                System.out.println("ID заявки: " + item.getId() + "Имя заявки: " + item.getName());
            }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
        int select = Integer.valueOf(input.askStr("Select: "));
        if (select == 0) {
            StartUI.createItem(input, tracker);
        } else if (select == 1) {
            StartUI.showItems(input, tracker);
        } else if (select == 2) {
           StartUI.editItem(input, tracker);
        } else if (select == 3) {
            StartUI.deleteItem(input, tracker);
        } else if (select == 4) {
            StartUI.findById(input, tracker);
        } else if (select == 5) {
            StartUI.findByName(input, tracker);
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
        Input input = new ConsoleInput();;
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}