package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    List<Order> orders = new ArrayList<>();

    public OrderListRepo(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Order getOrderById(String orderId) {
        for (Order order : orders) {
            if (order.orderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    public Order addOrder(Order order) {
        orders.add(order);
        return order;
    }

    public Order removeOrder(Order order) {
        orders.remove(order);
        return order;
    }

}
