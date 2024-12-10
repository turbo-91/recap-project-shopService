package org.example;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo1 = new ProductRepo(new ArrayList<>());

        Product sneakers = Product.builder()
                .productId("sn12")
                .name("Sneakers")
                .price(BigDecimal.ONE)
                .build();

        Product mobilePhone =Product.builder()
                .productId("mob34")
                .name("Mobile")
                .price(BigDecimal.TEN)
                .build();

        Product plant = Product.builder()
                .productId("pl12")
                .name("Monstera")
                .price(BigDecimal.TWO).
                build();

        productRepo1.addProduct(sneakers)
                .addProduct(mobilePhone)
                .addProduct(plant);

        OrderMapRepo testOrderMapRepo = new OrderMapRepo();

        ShopService shopService1 = new ShopService(productRepo1, testOrderMapRepo);

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