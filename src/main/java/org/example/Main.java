package org.example;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo1 = new ProductRepo(new ArrayList<>());
        OrderMapRepo testOrderMapRepo = new OrderMapRepo();
        ShopService shopService1 = new ShopService(productRepo1, testOrderMapRepo);

        Product sneakers = Product.builder()
                .productId("sn12")
                .name("Sneakers")
                .price(BigDecimal.TEN)
                .build();

        Product mobilePhone =Product.builder()
                .productId("mob34")
                .name("Mobile")
                .price(BigDecimal.TEN)
                .build();

        Product plant = Product.builder()
                .productId("pl12")
                .name("Monstera")
                .price(BigDecimal.TEN).
                build();

        productRepo1.addProduct(sneakers)
                .addProduct(mobilePhone)
                .addProduct(plant);

        OrderItem item1 = OrderItem.builder()
                .product(sneakers)
                .quantity(2)
                .build();

        OrderItem item2 = OrderItem.builder()
                .product(plant)
                .quantity(1)
                .build();

        OrderItem item3 = OrderItem.builder()
                .product(mobilePhone)
                .quantity(7)
                .build();

        List<OrderItem> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);
        List<OrderItem> items2 = new ArrayList<>();
        items2.add(item3);
        items2.add(item1);
        List<OrderItem> items3 = new ArrayList<>();
        items3.add(item2);
        items3.add(item2);

        Order order1 = new Order("oId1", items1);
        Order order2 = new Order("oId2", items2);
        Order order3 = new Order("oId3", items3);

        System.out.println("----------------------------------");
        System.out.println("Orders:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        testOrderMapRepo.addOrder(order1);
        testOrderMapRepo.addOrder(order2);
        testOrderMapRepo.addOrder(order3);

        System.out.println("----------------------------------");
        System.out.println("testOrderMapRepo:");
        System.out.println(order1);





//        OrderItem item1 = new OrderItem(sneakers, 2);
//        OrderItem item2 = new OrderItem(sneakers, 3);
//        OrderItem item3 = new OrderItem(sneakers, 4);
//        List<OrderItem> items1 = new ArrayList<>();
//        items1.add(item1);
//        items1.add(item2);
//        List<OrderItem> items2 = new ArrayList<>();
//        items2.add(item3);
//        items2.add(item1);
//        Order order1 =  new Order("14324", items1, BigDecimal.ZERO, Order.orderStatus.PROCESSING, ZonedDateTime.now());
//        Order order2 =  new Order("14adsfg4", items2, BigDecimal.ZERO, Order.orderStatus.COMPLETED, ZonedDateTime.now());
//        testOrderMapRepo.addOrder(order1);
//        testOrderMapRepo.addOrder(order2);

    }
}