package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GroupMethodTest {

    @Test
    public void groupingByAge() {
        GroupMethod.User u1 = new GroupMethod.User(10, "Volodya");
        GroupMethod.User u2 = new GroupMethod.User(15, "Olya");
        GroupMethod.User u3 = new GroupMethod.User(10, "Lyuba");
        GroupMethod.User u4 = new GroupMethod.User(22, "Hariton");
        Map<Integer, List<GroupMethod.User>> expect = Map.of(
                10, List.of(u1, u3),
                15, List.of(u2),
                22, List.of(u4)
        );
        assertEquals(expect, GroupMethod.groupingByAge(List.of(u1, u2, u3, u4)));
    }
}