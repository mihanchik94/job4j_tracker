package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest  {

    @Test
    public void addUser() {
        User user = new User("4587", "Mikhail Ponomarev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("4587"), is(user));
    }

    @Test
    public void addAccount() {
        User user = new User("4587", "Mikhail Ponomarev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("7771", 10000));
        assertThat(bank.findByRequisite("4587", "7771").getBalance(), is(10000.0));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("4587", "Mikhail Ponomarev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("7771", 10000));
        assertNull(bank.findByRequisite("45", "7771"));
    }

    @Test
    public void transferMoney() {
        User user = new User("4587", "Mikhail Ponomarev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("7771", 10000));
        bank.addAccount(user.getPassport(), new Account("7772", 1000));
        bank.transferMoney(user.getPassport(), "7771", user.getPassport(), "7772", 4500);
        assertThat(bank.findByRequisite(user.getPassport(), "7772").getBalance(), is(5500.0));
    }
}