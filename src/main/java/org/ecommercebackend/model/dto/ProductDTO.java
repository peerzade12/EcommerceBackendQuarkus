package org.ecommercebackend.model.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.ecommercebackend.model.entity.enums.ProductCategory;

public class ProductDTO {

    private String productName;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    private double price;
    private int rating;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

