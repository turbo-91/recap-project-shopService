package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public boolean placeOrder(String orderId, List<String> productIds) {
        List<Product> orderedProducts = new ArrayList<>();

        for (String productId : productIds) {
            Product product = productRepo.getProductById(productId);
            if (product == null) {
                System.out.println("Product does not exist.");
                return false;
            }
            orderedProducts.add(product);
        }

        Order newOrder = new Order(orderId, orderedProducts);

        orderRepo.addOrder(newOrder);
        System.out.println("Order placed successfully: " + newOrder);
        return true;
    }
}


