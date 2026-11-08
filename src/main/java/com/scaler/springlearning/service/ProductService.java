package com.scaler.springlearning.service;


import com.scaler.springlearning.dto.ProductRequest;
import com.scaler.springlearning.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private final Map<Long, ProductResponse> products;
    private Long idCount = 1L;


    public ProductService() {
        this.products = new HashMap<>();
    }

    public ProductResponse createProduct(ProductRequest request) {
        ProductResponse product = new ProductResponse(idCount, request.getName(), request.getPrice(), request.isAvailable());
        products.put(idCount, product);
        idCount++;
        return product;
    }

    public ProductResponse getProduct(long id) {
        return products.getOrDefault(id, null);
    }
}
