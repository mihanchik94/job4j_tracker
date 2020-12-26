package ru.job4j.search;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Mikhail", "Ponomarev", "534872", "Moscow")
        );
        var persons = phones.find("Mikhail");
        assertThat(persons.get(0).getSurname(), is("Ponomarev"));
    }
}