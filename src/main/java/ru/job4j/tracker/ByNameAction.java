package ru.job4j.tracker;

public class ByNameAction implements UserAction {
    private final Output output;

    public ByNameAction(Output output){
        this.output = output;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Find items by name ====");
        String byName = input.askStr("Введите имя заявки, которую вы хотите найти");
        Item[] items = tracker.findByName(byName);
        if (items.length == 0) {
            output.println("Заявки не найдены");
        } else
            for (Item item : items) {
                output.println("ID заявки: " + item.getId() + "Имя заявки: " + item.getName());
            }
        return true;
    }
}
