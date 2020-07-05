package ru.job4j.tracker;

import org.junit.Test;

import java.util.Scanner;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;


public class StartUITest {

    @Test
    public void whenAddItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void testEditItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[]{"0", item.getId(), replacedName, "1"});
        UserAction[] actions = {
                new EditAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void testDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(new String[]{"0", item.getId(), "1"});
        UserAction[] actions = {
                new DeleteAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void testFindAllItems() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(new String[]{"0", "1"});
        UserAction[] actions = {
            new ShowAction(output),
            new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator() +
                "=== Show all items ====" +
                System.lineSeparator() +
                "Заявки отсутствуют" +
                System.lineSeparator() +
                "Menu." +
                System.lineSeparator() +
                " Exit" +
                System.lineSeparator()));
    }

    @Test
    public void testFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        String name = "Name";
        Input in = new StubInput(new String[]{"0", name, "1"});
        Item item = tracker.add(new Item(name));
        UserAction[] actions = {
           new ByNameAction(out),
           new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "=== Find items by name ====" + System.lineSeparator()
                + "ID заявки: " + item.getId() + "Имя заявки: " + item.getName() + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + " Exit" + System.lineSeparator()));

    }

    @Test
    public void testFindByItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        String name = "Name";
        Item item = tracker.add(new Item(name));
        Input in = new StubInput(new String[]{"0", item.getId(), "1"});
        UserAction[] actions = {
                new ByIdAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
        + "=== Find item by Id ====" + System.lineSeparator()
        + " ID заявки: " + item.getId() + " Имя заявки: " + item.getName() + System.lineSeparator()
        + "Menu." + System.lineSeparator()
        + " Exit" + System.lineSeparator()));
    }


    @Test
    public void whenExit() {
        Input input = new ConsoleInput();
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)};
        new StartUI(out).init(input, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()));
    }
}