package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;



public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("145f", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("145f"), is(new Order("145f","Dress")));
    }
}