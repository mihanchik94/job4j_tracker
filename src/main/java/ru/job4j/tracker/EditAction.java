package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output output;

    public EditAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Edit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Edit item ====");
        int id = input.askInt("Введите ID заявки, которую вы хотите отредактировать");
        String name = input.askStr("Введите новое имя заявки");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            output.println("Заявка успешно отредактирована");
        } else {
            output.println("Указанный ID не найден");
        }
        return true;
    }
}
