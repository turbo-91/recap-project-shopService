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

    public boolean placeOrder(String orderId, List<String> productIds, List<Integer> quantities) {
        List<OrderItem> orderItems = new ArrayList<>();

        for (int i = 0; i < productIds.size(); i++) {
            String productId = productIds.get(i);
            int quantity = quantities.get(i);

            Product product = productRepo.getProductById(productId);
            if (product == null) {
                System.out.println("Product with ID " + productId + " does not exist.");
                return false;
            }

            orderItems.add(new OrderItem(product, quantity));
        }

        Order newOrder = new Order(orderId, orderItems);
        orderRepo.addOrder(newOrder);
        System.out.println("Order placed successfully.");
        return true;
    }

    public boolean updateOrderQuantity(String orderId, String productId, int newQuantity) {
        Order order = orderRepo.getOrderById(orderId);
        if (order == null) {
            System.out.println("Order with ID " + orderId + " does not exist.");
            return false;
        }

        for (OrderItem item : order.items()) {
            if (item.getProduct().productId().equals(productId)) {
                item.setQuantity(newQuantity);
                System.out.println("Updated quantity for product " + productId + " to " + newQuantity);
                return true;
            }
        }

        System.out.println("Product with ID " + productId + " not found in order " + orderId);
        return false;
    }
}


