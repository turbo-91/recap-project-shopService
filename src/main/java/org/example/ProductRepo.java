package org.example;

import java.math.BigDecimal;

public record ProductRepo(
        String id,
        String name,
        String description,
        BigDecimal price,
        int quantityInStock
) {

    public ProductRepo withId(String id) {
        return new ProductRepo(id, name, description, price, quantityInStock);
    }
    public ProductRepo withName(String name) {
        return new ProductRepo(name, name, description, price, quantityInStock);
    }
    public ProductRepo withDescription(String description) {
        return new ProductRepo(name, description, description, price, quantityInStock);
    }
    public ProductRepo withPrice(BigDecimal price) {
        return new ProductRepo(name, name, description, price, quantityInStock);
    }
    public ProductRepo withQuantityInStock(int quantityInStock) {
        return new ProductRepo(name, name, description, price, quantityInStock);
    }
    
}
