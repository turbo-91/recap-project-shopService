package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private final ProductRepo productRepo;
    private final OrderListRepo orderListRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
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

        orderListRepo.addOrder(newOrder);
        System.out.println("Order placed successfully: " + newOrder);
        return true;
    }
}


}
