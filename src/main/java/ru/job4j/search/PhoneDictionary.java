package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        if (key == null) {
            throw new NullPointerException("The Key is Null!");
        }
        Predicate<Person> combine = person -> person.getName().contains(key) || person.getSurname().contains(key) || person.getPhone().contains(key) || person.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        /*for (Person value : persons) {
            if (value.getName().contains(key) || value.getSurname().contains(key) || value.getPhone().contains(key) || value.getAddress().contains(key)) {
                personList.add(value);
            }*/
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

