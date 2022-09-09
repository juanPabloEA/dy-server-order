package com.dy.order.controller;

import com.dy.order.controller.model.OrderRequest;
import com.dy.order.controller.model.OrderResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @PostMapping("/order")
    public ResponseEntity<OrderResponse> addOrder(@RequestBody OrderRequest orderRequest) {
        LOGGER.info("start: OrderController::addOrder");
        return ResponseEntity.ok(OrderResponse.builder().result("OK").build());
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<OrderResponse> getOrder(@PathVariable String orderId) {
        LOGGER.info("start: OrderController::getOrder");
        return ResponseEntity.ok(OrderResponse.builder().result("OK").build());
    }

    @PutMapping("/order")
    public ResponseEntity<OrderResponse> putOrder(@RequestBody OrderRequest orderRequest) {
        LOGGER.info("start: OrderController::putOrder");
        return ResponseEntity.ok(OrderResponse.builder().result("OK").build());
    }

    @DeleteMapping("/order/{orderId}")
    public ResponseEntity<String> deleteOrder(@PathVariable String orderId) {
        LOGGER.info("start: OrderController::deleteOrder");
        return ResponseEntity.ok(HttpStatus.ACCEPTED.toString());
    }
}
