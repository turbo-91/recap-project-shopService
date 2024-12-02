package org.example;

import java.math.BigDecimal;

public record Order(String orderId, Product product) {
    public Order withOrderId(String orderId) {
        return new Order(orderId, product);
    }
    public Order withProduct(Product product) {
        return new Order(orderId, product);
    }
}
