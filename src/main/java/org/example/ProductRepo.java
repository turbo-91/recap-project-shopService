package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepo {
    List<Product> products = new ArrayList<>();

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Optional<Product> getProductById(String productId) {
        for (Product product : products) {
            if (product.productId().equals(productId))
                return Optional.of(product);
        }
        return Optional.empty();
    }

    public ProductRepo addProduct(Product product) {
        products.add(product);
        return this;
    }

    public ProductRepo removeProduct(Product product) {
        products.remove(product);
        return this;
    }
}
