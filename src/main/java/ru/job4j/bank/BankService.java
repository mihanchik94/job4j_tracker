package ru.job4j.bank;


import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        //if(!users.containsKey(user)) {
            //users.put(user, new ArrayList<Account>());}
        users.putIfAbsent(user, new ArrayList<Account>());
    }


    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst());
    }

    public void transferMoney(String scrPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {

        Optional<Account> scr = findByRequisite(scrPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);


        if (scr.isPresent() && dest.isPresent() && scr.get().getBalance() >= amount) {
            scr.get().setBalance(scr.get().getBalance() - amount);
            dest.get().setBalance(dest.get().getBalance() + amount);
        }
    }

}
