package ru.job4j.tracker;

import com.sun.source.tree.IfTree;

public class ByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String byId = input.askStr("Введите ID заявки, которую вы хотите найти");
        Item item = tracker.findById(byId);
        if (item != null) {
            System.out.println(" ID заявки: " + item.getId() + " Имя заявки: " + item.getName());
        } else
            System.out.println("Указанный номер ID не найден");
        return true;
    }
}
