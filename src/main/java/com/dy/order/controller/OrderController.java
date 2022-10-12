package com.dy.order.controller;

import com.dy.order.controller.model.request.OrderRequest;
import com.dy.order.controller.model.response.OrderResponse;
import com.dy.order.domain.order.DeleteOrderUseCase;
import com.dy.order.domain.order.GetOrderUseCase;
import com.dy.order.domain.order.PostOrderUseCase;
import com.dy.order.domain.order.PutOrderUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    private final GetOrderUseCase getOrderUseCase;
    private final PostOrderUseCase postOrderUseCase;
    private final PutOrderUseCase putOrderUseCase;
    private final DeleteOrderUseCase deleteOrderUseCase;

    public OrderController(GetOrderUseCase getOrderUseCase, PostOrderUseCase postOrderUseCase, PutOrderUseCase putOrderUseCase, DeleteOrderUseCase deleteOrderUseCase) {
        this.getOrderUseCase = getOrderUseCase;
        this.postOrderUseCase = postOrderUseCase;
        this.putOrderUseCase = putOrderUseCase;
        this.deleteOrderUseCase = deleteOrderUseCase;
    }

    @PostMapping(value = "order")
    public ResponseEntity<OrderResponse> addOrder(@RequestBody OrderRequest orderRequest) {
        LOGGER.info("start: OrderController::addOrder");
        postOrderUseCase.execute(orderRequest);
        return ResponseEntity.ok(OrderResponse.builder().result("OK").build());
    }

    @GetMapping(value = "order/{orderId}")
    public ResponseEntity<OrderResponse> getOrder(@PathVariable String orderId) {
        LOGGER.info("start: OrderController::getOrder");
        getOrderUseCase.execute(orderId);
        return ResponseEntity.ok(OrderResponse.builder().build());
    }

    @PutMapping(value = "order")
    public ResponseEntity<OrderResponse> putOrder(@RequestBody OrderRequest orderRequest) {
        LOGGER.info("start: OrderController::putOrder");
        putOrderUseCase.execute(orderRequest);
        return ResponseEntity.ok(OrderResponse.builder().result("OK").build());
    }

    @DeleteMapping(value = "order/{orderId}")
    public ResponseEntity<String> deleteOrder(@PathVariable String orderId) {
        LOGGER.info("start: OrderController::deleteOrder");
        deleteOrderUseCase.execute(orderId);
        return ResponseEntity.ok(HttpStatus.ACCEPTED.toString());
    }
}
