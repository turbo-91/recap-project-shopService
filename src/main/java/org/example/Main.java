package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo(new ArrayList<>());

        Product sneakers = new Product("sn12", "Sneakers", BigDecimal.ONE);
        Product mobilePhone = new Product("mob34", "Mobile", BigDecimal.TEN);
        Product plant = new Product("pl12", "Monstera", BigDecimal.TWO);

        productRepo.addProduct(sneakers)
                .addProduct(mobilePhone)
                .addProduct(plant);

        System.out.println("All products:");
        System.out.println(productRepo.getProducts());

        String searchId = "mob34";
        Product foundProduct = productRepo.getProductById(searchId);
        System.out.println("productwithId mob34" + foundProduct);

        ProductRepo productRepo1 = new ProductRepo(new ArrayList<>());
        ProductRepo productRepo2 = new ProductRepo(new ArrayList<>());
        productRepo1.addProduct(sneakers);
        productRepo1.addProduct(mobilePhone);
        productRepo2.addProduct(plant);
        productRepo2.addProduct(sneakers);
        System.out.println("Order 1:");
        System.out.println(productRepo1.getProducts());
        System.out.println("Order 2:");
        System.out.println(productRepo2.getProducts());
        productRepo2.removeProduct(sneakers);
        System.out.println("Order 2 nach remove:");
        System.out.println(productRepo2.getProducts());

        OrderMapRepo testOrderMapRepo = new OrderMapRepo();

        ShopService shopService1 = new ShopService(productRepo1, testOrderMapRepo);

        OrderItem item1 = new OrderItem(sneakers, 2);
        OrderItem item2 = new OrderItem(sneakers, 3);
        OrderItem item3 = new OrderItem(sneakers, 4);
        List<OrderItem> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);
        List<OrderItem> items2 = new ArrayList<>();
        items2.add(item3);
        items2.add(item1);


        Order order1 =  new Order("14324", items1, BigDecimal.ZERO, Order.orderStatus.PROCESSING);
        Order order2 =  new Order("14adsfg4", items2, BigDecimal.ZERO, Order.orderStatus.COMPLETED);
        testOrderMapRepo.addOrder(order1);
        testOrderMapRepo.addOrder(order2);

        List<Order> processingOrders = shopService1.getOrdersByOrderStatus(Order.orderStatus.PROCESSING);
        System.out.println("Processing Orders: " + processingOrders);

        List<Order> completedOrders = shopService1.getOrdersByOrderStatus(Order.orderStatus.COMPLETED);
        System.out.println("Completed Orders: " + completedOrders);

    }
}