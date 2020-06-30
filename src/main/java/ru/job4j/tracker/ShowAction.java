package ru.job4j.tracker;

public class ShowAction implements UserAction {

    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("Заявки отсутствуют");
        } else
            for (Item item : items) {
                if (item != null) {
                    System.out.println("ID заявки: " + item.getId() + "Имя заявки: " + item.getName());
                }
            }
        return true;
    }
}
