package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;


public class ValidateInputTest {

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        ValidateInput in = new ValidateInput(new StubInput(new String[] { "1" , "0"}), out);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> action = new ArrayList<>();
               action.add(new Exit(out));
        new StartUI(out).init(in, tracker,action);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "Please select key from menu.%n"
                                + " Exit%n")));
    }

    @Test
    public void whenInvalidStrExit() {
        Output out = new StubOutput();
        Input in = new ValidateInput(new StubInput(new String[] {"ggg", "0"}), out);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
               actions.add(new Exit(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "Please enter validate data again.%n"
                                + " Exit%n")));
    }
}