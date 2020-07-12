package ru.job4j.tracker;


public class StartUI {
    private final Output output;

    public StartUI(Output output) {
        this.output = output;
    }


    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
        int select = input.askInt("select");
            if (select < 0 || select >= actions.length) {
                output.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
        UserAction action = actions[select];
        run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        output.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + " " + actions[index].name());
        }
    }


    public static void main(String[] args) {
        Output out = new ConsoleOutput();
        Input input = new ValidateInput(out, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new EditAction(out),
                new ShowAction(out),
                new DeleteAction(out),
                new ByIdAction(out),
                new ByNameAction(out),
                new Exit(out)};//
        new StartUI(out).init(input, tracker, actions);
    }
}