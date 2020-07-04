package ru.job4j.tracker;

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
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            output.println("Заявки отсутствуют");
        } else
            for (Item item : items) {
                if (item != null) {
                    output.println("ID заявки: " + item.getId() + "Имя заявки: " + item.getName());
                }
            }
        return true;
    }
}
