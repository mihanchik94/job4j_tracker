package ru.job4j.stream;

public class Worker {
    private int age;

    private Company company;

    public Worker(int age, Company company) {
        this.age = age;
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public Company getCompany() {
        return company;
    }
}
