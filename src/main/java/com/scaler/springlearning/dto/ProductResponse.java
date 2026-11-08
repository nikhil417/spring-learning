package com.scaler.springlearning.dto;

public class ProductResponse {
    public long id;
    public String name;
    public double price;
    public boolean available;

    public ProductResponse(long id, String name, double price, boolean available) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}
