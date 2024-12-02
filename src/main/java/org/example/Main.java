package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo(new ArrayList<>());


        Product sneakers = new Product("sn12", "Sneakers");
        Product mobilePhone = new Product("mob34", "Mobile");
        Product plant = new Product("pl12", "Monstera");

        productRepo.addProduct(sneakers)
                .addProduct(mobilePhone)
                .addProduct(plant);

        System.out.println("All products:");
        System.out.println(productRepo.getProducts());

        String searchId = "mob34";
        Product foundProduct = productRepo.getProductById(searchId);
        System.out.println("productwithId mob34" + foundProduct);

        ProductRepo order1 = new ProductRepo(new ArrayList<>());
        ProductRepo order2 = new ProductRepo(new ArrayList<>());
        order1.addProduct(sneakers);
        order1.addProduct(mobilePhone);
        order2.addProduct(plant);
        order2.addProduct(sneakers);
        System.out.println("Order 1:");
        System.out.println(order1.getProducts());
        System.out.println("Order 2:");
        System.out.println(order2.getProducts());
        order2.removeProduct(sneakers);
        System.out.println("Order 2 nach remove:");
        System.out.println(order2.getProducts());






    }
}