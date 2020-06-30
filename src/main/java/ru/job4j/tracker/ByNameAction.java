package ru.job4j.tracker;

public class ByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String byName = input.askStr("Введите имя заявки, которую вы хотите найти");
        Item[] items = tracker.findByName(byName);
        if (items.length == 0) {
            System.out.println("Заявки не найдены");
        } else
            for (Item item : items) {
                System.out.println("ID заявки: " + item.getId() + "Имя заявки: " + item.getName());
            }
        return true;
    }
}
