package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Введите ID заявки, которую вы хотите отредактировать");
        String name = input.askStr("Введите новое имя заявки");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка успешно отредактирована");
        } else
            System.out.println("Указанный ID не найден");
        return true;
    }
}
