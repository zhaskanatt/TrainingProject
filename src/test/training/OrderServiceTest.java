package com.example.training.services;

import com.example.training.models.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrderServiceTest {

    private OrderService orderService;

    @Before
    public void setUp() {
        orderService = new OrderService();
    }

    @Test
    public void testCreateOrder() {
        Order order = new Order();

        orderService.createOrder(order);

        Assert.assertNotNull(order.getId());
    }
}
