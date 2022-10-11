package com.dy.order.controller;

import com.dy.order.controller.model.request.OrderRequest;
import com.dy.order.controller.model.response.OrderResponse;
import com.dy.order.domain.order.OrderUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    private final OrderUseCase orderUseCase;

    public OrderController(OrderUseCase orderUseCase) {
        this.orderUseCase = orderUseCase;
    }

    @PostMapping(value = "order")
    public ResponseEntity<OrderResponse> addOrder(@RequestBody OrderRequest orderRequest) {
        LOGGER.info("start: OrderController::addOrder");
        orderUseCase.addOrder(orderRequest);
        return ResponseEntity.ok(OrderResponse.builder().result("OK").build());
    }

    @GetMapping(value = "order/{orderId}")
    public ResponseEntity<OrderResponse> getOrder(@PathVariable String orderId) {
        LOGGER.info("start: OrderController::getOrder");
        return ResponseEntity.ok(orderUseCase.getOrder(orderId));
    }

    @PutMapping(value = "order")
    public ResponseEntity<OrderResponse> putOrder(@RequestBody OrderRequest orderRequest) {
        LOGGER.info("start: OrderController::putOrder");
        orderUseCase.editOrder(orderRequest);
        return ResponseEntity.ok(OrderResponse.builder().result("OK").build());
    }

    @DeleteMapping(value = "order/{orderId}")
    public ResponseEntity<String> deleteOrder(@PathVariable String orderId) {
        LOGGER.info("start: OrderController::deleteOrder");
        orderUseCase.deleteOrder(orderId);
        return ResponseEntity.ok(HttpStatus.ACCEPTED.toString());
    }
}
