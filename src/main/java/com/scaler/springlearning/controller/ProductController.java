package com.scaler.springlearning.controller;

import com.scaler.springlearning.dto.ProductRequest;
import com.scaler.springlearning.dto.ProductResponse;
import com.scaler.springlearning.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/products/{id}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable long id) {
//        return new ProductResponse(id, "Macbook Pro", 189900.0, true);

        ProductResponse response = productService.getProduct(id);
        if (response == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/api/products")
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest request) {
//        ProductResponse response = new ProductResponse(12, request.getName(), request.getPrice(), request.isAvailable());
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);

        ProductResponse response = this.productService.createProduct(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
