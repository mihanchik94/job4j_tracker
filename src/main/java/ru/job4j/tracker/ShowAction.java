package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class ShowAction implements UserAction {
    private final Output output;

    public ShowAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Show All";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Show all items ====");
        List<Item> all = tracker.findAll();
        if (all.size() == 0) {
            output.println("Заявки отсутствуют");
        } else {
            for (Item item : all) {
                if (item != null) {
                    output.println("ID заявки: " + item.getId() + "Имя заявки: " + item.getName());
                }
            }
        }
        return true;
    }
}
