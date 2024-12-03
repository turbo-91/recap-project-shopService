package org.example;

import java.util.List;

public interface OrderRepo {
    List<Order> getOrders();
    Order getOrderById(String orderId);
    Order addOrder(Order order);
    Order removeOrder(Order order);
}
