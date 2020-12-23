package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
        @Test
        public void collect() {
        List<Profile> profiles = List.of(
        new Profile(new Address("Moscow", "Street 1", 1, 1)),
        new Profile(new Address("New York", "Street 2", 2, 2)),
        new Profile(new Address("Novgorod", "Street 3", 3, 3)),
        new Profile(new Address("New York", "Street 4", 4, 4))
        );
        List<Address> expected = List.of(
                new Address("Moscow", "Street 1", 1, 1),
                new Address("New York", "Street 2", 2, 2),
                new Address("New York", "Street 4", 4, 4),
                new Address("Novgorod", "Street 3", 3, 3)
        );
        assertThat(expected, is(new Profiles().collect(profiles)));
        }


        @Test
        public void whenCollectTheSameAddress() {
                List<Profile> profiles = List.of(
                        new Profile(new Address("Moscow", "Street 1", 1, 1)),
                        new Profile(new Address("New York", "Street 2", 2, 2)),
                        new Profile(new Address("Novgorod", "Street 3", 3, 3)),
                        new Profile(new Address("New York", "Street 2", 2, 2))
                );
                List<Address> expected = List.of(
                        new Address("Moscow", "Street 1", 1, 1),
                        new Address("New York", "Street 2", 2, 2),
                        new Address("Novgorod", "Street 3", 3, 3)
                );
                assertThat(expected, is(new Profiles().collect(profiles)));
        }
}
