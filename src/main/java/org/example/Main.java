package org.example;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo1 = new ProductRepo(new ArrayList<>());

        Product sneakers = new Product("sn12", "Sneakers", BigDecimal.ONE);
        Product mobilePhone = new Product("mob34", "Mobile", BigDecimal.TEN);
        Product plant = new Product("pl12", "Monstera", BigDecimal.TWO);

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