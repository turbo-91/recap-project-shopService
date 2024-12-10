package org.example;

import lombok.With;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@With
public record Order
        (String orderId,
         List<OrderItem> items,
         BigDecimal totalPrice,
         orderStatus status,
         ZonedDateTime orderTimestamp) {

    public enum orderStatus {
    PROCESSING, IN_DELIVERY, COMPLETED
    }

    public Order(String orderId, List<OrderItem> items) {
        this(orderId, items, calculateTotalPrice(items), orderStatus.PROCESSING, ZonedDateTime.now());
    }

    private static BigDecimal calculateTotalPrice(List<OrderItem> items) {
        BigDecimal total = BigDecimal.ZERO;
        for (OrderItem item : items) {
            total = total.add(item.getItemTotalPrice());
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", orderTimestamp=" + orderTimestamp +
                '}';
    }
}