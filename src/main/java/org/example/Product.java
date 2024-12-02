package org.example;

import java.math.BigDecimal;

public record Product(
        String productId,
        String name,
        String description,
        BigDecimal price,
        int quantityInStock
) {

    public Product withId(String productId) {
        return new Product(productId, name, description, price, quantityInStock);
    }

    public Product withName(String name) {
        return new Product(productId, name, description, price, quantityInStock);
    }

    public Product withDescription(String description) {
        return new Product(productId, name, description, price, quantityInStock);
    }

    public Product withPrice(BigDecimal price) {
        return new Product(productId, name, description, price, quantityInStock);
    }

    public Product withQuantityInStock(int quantityInStock) {
        return new Product(productId, name, description, price, quantityInStock);
    }

}
