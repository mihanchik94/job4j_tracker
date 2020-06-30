package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String del = input.askStr("Введите ID заявки, которую вы хотите удалить");
        if (tracker.delete(del)) {
            System.out.println("Заявка успешно удалена");
        } else
            System.out.println("Указанный ID не найден");
        return true;
    }
}
