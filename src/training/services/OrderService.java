package com.example.training.services;

import com.example.training.models.Order;
import com.example.training.models.User;
import com.example.training.security.Permission;
import com.example.training.security.SecurityContext;

public class OrderService {
    public void createOrder(Order order) {
        User user = SecurityContext.getCurrentUser();
        if (!SecurityContext.hasPermission(user, Permission.CREATE_ORDER)) {
            throw new SecurityException("User not authorized to create orders.");
        }

        validateOrder(order);
    }

    private void validateOrder(Order order) {
        // Example validation
        if (order == null || order.getProductIds().isEmpty()) {
            throw new IllegalArgumentException("Order must contain");
        }
    }
}
