package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        /*System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob().thenComparing(new SortByPriorityJob()));
        System.out.println(jobs);*/
        Comparator<Job> comb = new SortByNameJobDown().thenComparing(new SortByPriorityJobDown()).thenComparing(new SortJobByNameLn());
        Collections.sort(jobs, comb);
        System.out.println(jobs);
    }
}
