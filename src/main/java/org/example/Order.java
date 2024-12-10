package org.example;

import java.math.BigDecimal;
import java.util.List;
public record Order(String orderId, List<OrderItem> items, BigDecimal totalPrice, orderStatus status) {

    public enum orderStatus {
    PROCESSING, IN_DELIVERY, COMPLETED
    }

    public Order(String orderId, List<OrderItem> items) {
        this(orderId, items, calculateTotalPrice(items), orderStatus.PROCESSING);
    }

    private static BigDecimal calculateTotalPrice(List<OrderItem> items) {
        BigDecimal total = BigDecimal.ZERO;
        for (OrderItem item : items) {
            total = total.add(item.getItemTotalPrice());
        }
        return total;
    }

    public Order withOrderId(String orderId) {
        return new Order(orderId, items, totalPrice, status);
    }

    public Order withItems(List<OrderItem> items) {
        return new Order(orderId, items, calculateTotalPrice(items), status);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                '}';
    }

    @Override
    public String orderId() {
        return orderId;
    }

    @Override
    public List<OrderItem> items() {
        return items;
    }

    @Override
    public BigDecimal totalPrice() {
        return totalPrice;
    }

    @Override
    public orderStatus status() {
        return status;
    }
}