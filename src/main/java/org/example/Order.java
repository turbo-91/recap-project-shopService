package org.example;

import java.util.List;

public record Order(String orderId, List<Product> products) {

    public Order withOrderId(String orderId) {
        return new Order(orderId, products);
    }

    public Order withProducts(List<Product> products) {
        return new Order(orderId, products);
    }

}
