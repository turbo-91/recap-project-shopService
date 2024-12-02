package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> products = new ArrayList<>();

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(String productId) {
        for (Product product : products) {
            if (product.productId().equals(productId))
                return product;
        }
        return null;
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
