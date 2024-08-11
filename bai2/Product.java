package org.example.ontap.baitapvenha.day11.collectionmap.bai2;

import java.util.Objects;

public class Product {
    private int productId;
    private String name;
    private String category;

    public Product(int productId, String name, String category) {
        this.productId = productId;
        this.name = name;
        this.category = category;
    }

    // Getter và Setter
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{productId=" + productId + ", name='" + name + "', category='" + category + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
