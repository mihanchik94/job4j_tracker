package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;

    private List<Bill> bills = new ArrayList<>();

    public User(String name, List<Bill> bills) {
        this.name = name;
        this.bills = bills;
    }

    public String getName() {
        return name;
    }

    public List<Bill> getBills() {
        return bills;
    }
}
