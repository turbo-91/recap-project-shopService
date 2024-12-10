package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo{
Map<String, Order> orders = new HashMap<>();

    @Override
    public List<Order> getOrders() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Order getOrderById(String orderId) {
        return orders.get(orderId);
    }

    @Override
    public Order addOrder(Order order) {
        orders.put(order.orderId(), order);
        return order;
    }

    @Override
    public Order removeOrder(Order order) {
        return orders.remove(order.orderId());
    }
}
