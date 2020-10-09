package ru.job4j.collection;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Comparator;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new SortByNameJobDown().thenComparing(new SortByPriorityJobDown());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByName() {
        int rsl = new SortByNameJob().compare(
                new Job("Designer", 2),
                new Job("Teacher", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameDown() {
        int rsl = new SortByNameJobDown().compare(
                new Job("Designer", 2),
                new Job("Teacher", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriority() {
        int rsl = new SortByPriorityJob().compare(
                new Job("Designer", 1),
                new Job("Teacher", 2));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityDown() {
        int rsl = new SortByPriorityJobDown().compare(
                new Job("Designer", 1),
                new Job("Teacher", 1));
        assertThat(rsl, is(0));
    }

    @Test
    public void whenComparatorByNameLn() {
        int rsl = new SortJobByNameLn().compare(
                new Job("Designer", 2),
                new Job("Teacher", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameLnAndPriority() {
        Comparator<Job> cmpNamePriority = new SortJobByNameLn().thenComparing(new SortByPriorityJob());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 3),
                new Job("Teacher", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameLnAndPriorityAndNamesIsTheSame() {
        Comparator<Job> cmpNamePriority = new SortJobByNameLn().thenComparing(new SortByPriorityJob());
        int rsl = cmpNamePriority.compare(
                new Job("Teacher", 3),
                new Job("Teacher", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

}