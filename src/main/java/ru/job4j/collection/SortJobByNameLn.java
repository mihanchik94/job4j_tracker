package ru.job4j.collection;

import java.util.Comparator;

public class SortJobByNameLn implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(first.getName().length(), second.getName().length());
    }
}
