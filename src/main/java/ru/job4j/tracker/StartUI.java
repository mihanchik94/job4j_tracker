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
        int select = input.askInt("select", actions.length);
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
        Input input = new ConsoleInput();
        Output out = new ConsoleOutput();
        Input validate = new ValidateInput(input, out);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new EditAction(out),
                new ShowAction(out),
                new DeleteAction(out),
                new ByIdAction(out),
                new ByNameAction(out),
                new Exit(out)};
        new StartUI(out).init(validate, tracker, actions);
    }
}