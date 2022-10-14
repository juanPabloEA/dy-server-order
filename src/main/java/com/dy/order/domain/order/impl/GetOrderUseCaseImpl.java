package com.dy.order.domain.order.impl;

import com.dy.order.controller.model.response.OrderResponse;
import com.dy.order.domain.order.GetOrderUseCase;
import com.dy.order.domain.order.mapper.OrderResponseMapper;
import com.dy.order.resource.repository.order.OrderRepository;
import org.springframework.stereotype.Component;

@Component
public class GetOrderUseCaseImpl implements GetOrderUseCase {

    private final OrderRepository orderRepository;

    public GetOrderUseCaseImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderResponse execute(String orderId) {
        return OrderResponseMapper.toController(orderRepository.getOrderById(orderId));
    }
}
