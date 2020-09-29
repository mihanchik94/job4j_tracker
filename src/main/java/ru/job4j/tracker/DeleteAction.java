package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output output;

    public DeleteAction(Output output){
        this.output = output;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Delete item ====");
        int del = input.askInt("Введите ID заявки, которую вы хотите удалить");
        if (tracker.delete(del)) {
            output.println("Заявка успешно удалена");
        } else
            output.println("Указанный ID не найден");
        return true;
    }
}
