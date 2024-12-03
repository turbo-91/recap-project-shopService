package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo{
Map<String, Order> orders = new HashMap<>();


    @Override
    public List<Order> getOrders() {
        return List.of();
    }

    @Override
    public Order getOrderById(String orderId) {
        return null;
    }

    @Override
    public Order addOrder(Order order) {
        return null;
    }

    @Override
    public Order removeOrder(Order order) {
        return null;
    }
}
