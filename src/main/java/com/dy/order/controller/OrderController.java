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
        LOGGER.info("init: OrderController::addOrder");
        return ResponseEntity.ok(OrderResponse.builder().build());
    }

    @GetMapping("/order")
    public ResponseEntity<OrderResponse> getOrder(@PathVariable(name = "orderId") String orderId) {
        LOGGER.info("init: OrderController::getOrder");
        return ResponseEntity.ok(OrderResponse.builder().build());
    }

    @PutMapping("/order")
    public ResponseEntity<OrderResponse> putOrder(@RequestBody OrderRequest orderRequest) {
        LOGGER.info("init: OrderController::putOrder");
        return ResponseEntity.ok(OrderResponse.builder().build());
    }

    @DeleteMapping("/order")
    public ResponseEntity<String> deleteOrder(@PathVariable(name = "orderId") String orderId) {
        LOGGER.info("init: OrderController::deleteOrder");
        return ResponseEntity.ok(HttpStatus.ACCEPTED.toString());
    }
}
