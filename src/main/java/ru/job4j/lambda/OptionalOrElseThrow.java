package ru.job4j.lambda;


//Нужно написать метод поиска пользователя по логину. Если ничего не найдено, то нужно вернуть исключение

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOrElseThrow {

    public static class User {
        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException {
    }

    public static User orElseThrow(List<User> list, String login) {
        return search(list, login).orElseThrow(UserNotFoundException::new);
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> user = Optional.empty();
        for (User usr : list) {
            if (usr.getLogin().equals(login)) {
                user = Optional.of(usr);
            }
        }
        return user;
    }
}
