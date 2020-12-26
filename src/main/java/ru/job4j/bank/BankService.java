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
        if (user.isPresent()) {
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst();
        } else {
            return Optional.empty();
        }
    }

    public void transferMoney(String scrPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {

        Optional<Account> scr = findByRequisite(scrPassport, srcRequisite);
        Account scrAccount = null;
        if (scr.isPresent()) {
            scrAccount = scr.get();
        }

        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        Account destAccount = null;
        if (dest.isPresent()) {
            destAccount = dest.get();
        }

        if (scrAccount != null && destAccount != null && scrAccount.getBalance() >= amount) {
            scrAccount.setBalance(scrAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
        }
    }

}
