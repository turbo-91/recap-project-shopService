package org.example;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Builder
public record Product(String productId, String name, BigDecimal price) {

    public Product withId(String productId) {
        return new Product(productId, name, price);
    }
    public Product withName(String name) {
        return new Product(productId, name, price);
    }
    public Product withPrice(BigDecimal price) {
        return new Product(productId, name, price);
    }
}
