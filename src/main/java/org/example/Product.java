package org.example;

import java.util.ArrayList;
import java.util.List;

public record Product(String productId, String name) {

    public Product withId(String productId) {
        return new Product(productId, name);
    }

    public Product withName(String name) {
        return new Product(productId, name);
    }



}
