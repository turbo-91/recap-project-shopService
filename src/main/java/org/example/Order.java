package org.example;

import java.math.BigDecimal;
import java.util.List;
public record Order(String orderId, List<OrderItem> items, BigDecimal totalPrice) {

    public Order(String orderId, List<OrderItem> items) {
        this(orderId, items, calculateTotalPrice(items));
    }

    private static BigDecimal calculateTotalPrice(List<OrderItem> items) {
        BigDecimal total = BigDecimal.ZERO;
        for (OrderItem item : items) {
            total = total.add(item.getItemTotalPrice());
        }
        return total;
    }

    public Order withOrderId(String orderId) {
        return new Order(orderId, items, totalPrice);
    }

    public Order withItems(List<OrderItem> items) {
        return new Order(orderId, items, calculateTotalPrice(items));
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                '}';
    }
}