package ru.job4j.stream;

public class Pair {
    private User user;
    private Bill bill;

    public Pair(User user, Bill bill) {
        this.user = user;
        this.bill = bill;
    }

    public User getUser() {
        return user;
    }

    public Bill getBill() {
        return bill;
    }
}
