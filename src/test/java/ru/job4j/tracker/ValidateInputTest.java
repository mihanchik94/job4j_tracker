package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;


public class ValidateInputTest {

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        ValidateInput in = new ValidateInput(new StubInput(new String[] { "1" , "0"}), out);
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker,action);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "Please select key from menu.%n"
                                + " Exit%n")));
    }

    @Test(expected = NumberFormatException.class)
    public void whenInvalidStrExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"ggg", "0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
    }
}