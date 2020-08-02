package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons= new ArrayList<>();

    public void add(Person person){
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
        ArrayList<Person> personList = new ArrayList<>();
        for (Person value : persons) {
            if (value.getName().contains(key) || value.getSurname().contains(key) || value.getPhone().contains(key) || value.getAddress().contains(key)) {
                personList.add(value);
            }
        }
        return personList;
    }

}
