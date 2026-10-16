package com.klu.ordervalidation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public Map<String, Object> createOrder(
            @Valid @RequestBody OrderRequest order) {

        Map<String, Object> response = new HashMap<>();

        response.put("message", "Order created successfully");
        response.put("customerName", order.getCustomerName());
        response.put("productName", order.getProductName());
        response.put("quantity", order.getQuantity());
        response.put("price", order.getPrice());

        return response;
    }
}