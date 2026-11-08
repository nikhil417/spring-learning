package com.scaler.springlearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {


    @GetMapping("/api/search")
    public String search(@RequestParam String keyword, @RequestParam(defaultValue = "10") int limit) {
        return "Searching for " + keyword + ", limit: " + limit;
    }
}
