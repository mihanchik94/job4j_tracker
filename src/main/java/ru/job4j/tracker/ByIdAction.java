package ru.job4j.tracker;

import com.sun.source.tree.IfTree;

public class ByIdAction implements UserAction {
    private final Output output;

    public ByIdAction(Output output){
        this.output = output;
    }

    @Override
    public String name() {
        return "Find by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Find item by Id ====");
        String byId = input.askStr("Введите ID заявки, которую вы хотите найти");
        Item item = tracker.findById(byId);
        if (item != null) {
            output.println(" ID заявки: " + item.getId() + " Имя заявки: " + item.getName());
        } else
            output.println("Указанный номер ID не найден");
        return true;
    }
}
