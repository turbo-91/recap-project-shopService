package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo {
    List<Order> ordersList = new ArrayList<>();

    public OrderListRepo(List<Order> ordersList) {
        this.ordersList = ordersList;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(ordersList, that.ordersList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ordersList);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "ordersList=" + ordersList +
                '}';
    }

    public OrderListRepo addOrder(Order order) {
        ordersList.add(order);
        return this;
    }

    public OrderListRepo removeOrder(Order order) {
        ordersList.remove(order);
        return this;
    }

    public Order getOrderbyId(String orderId) {
        for (Order order : ordersList) {
            if (order.orderId().equals(orderId)) return order;
            return null;
        }
    }

}
