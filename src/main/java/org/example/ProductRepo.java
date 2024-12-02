package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {
    List<Product> productList = new ArrayList<>();

    public ProductRepo(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productList);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + productList +
                '}';
    }

    public ProductRepo addProduct(Product product) {
        productList.add(product);
        return this;
    };

    public ProductRepo removeProduct(Product product) {
        productList.remove(product);
        return this;
    }

    public Product getProductById(String id) {
        for (Product product : productList) {
            if (product.id().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
