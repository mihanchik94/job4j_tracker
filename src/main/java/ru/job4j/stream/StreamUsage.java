package ru.job4j.stream;

//Отфильтруем все задачи, где в имени есть слово BUG и сохраним ее в коллекцию List.
//Получим только имена задач
//Получим время, затраченное на выполнение всех задач

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .collect(Collectors.toList());
        bugs.forEach(System.out::println);
        /*List<Task> container = new ArrayList<>();
        for (Task task : tasks) {
            if ("BUG".equals(task.name)) {
                container.add(task);
            }
        }*/

        List<String> names = tasks.stream()
                .map(task -> task.name)
                .collect(Collectors.toList());
        names.forEach(System.out::println);
        /*List<String> container = new ArrayList<>();
        for (Task task : tasks) {
            container.add(task.name);
        }*/

        long total = tasks.stream().
                map(task -> task.spent).
                reduce(0L, Long::sum);
        System.out.println(total);
        /*long total = 0L;
        for (Task task : tasks) {
            total += task.spent;
        }*/

        List<Task> tsks = List.of(
                new Task("Bug #1", 10),
                new Task("Task #2", 20),
                new Task("Bug #3", 40)
        );
        tsks.stream()
                .filter(task -> task.name.contains("Bug"))
                .filter(task -> task.spent > 30)
                .map(task -> task.name + " " + task.spent)
                .forEach(System.out::println);
    }
}

