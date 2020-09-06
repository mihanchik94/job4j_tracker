package ru.job4j.tracker;


import java.util.ArrayList;

public class StartUI {
    private final Output output;

    public StartUI(Output output) {
        this.output = output;
    }


    public void init(Input input, Tracker tracker, ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
        int select = input.askInt("select: ");
        if (select < 0 || select >= actions.size()) {
            output.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
            continue;
        }
        UserAction action = actions.get(select);
        run = action.execute(input, tracker);
        }
    }

    private void showMenu(ArrayList<UserAction> actions) {
        output.println("Menu.");
        for (UserAction action : actions) {
            System.out.println(actions.indexOf(action) + " " + action.name());
        }
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Output out = new ConsoleOutput();
        Input validate = new ValidateInput(input, out);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
                actions.add(new CreateAction(out));
                actions.add(new EditAction(out));
                actions.add(new ShowAction(out));
                actions.add(new DeleteAction(out));
                actions.add(new ByIdAction(out));
                actions.add(new ByNameAction(out));
                actions.add(new Exit(out));
        new StartUI(out).init(validate, tracker, actions);
    }
}