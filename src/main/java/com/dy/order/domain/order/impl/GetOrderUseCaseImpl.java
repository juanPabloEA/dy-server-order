package com.dy.order.domain.order.impl;

import com.dy.order.controller.model.response.OrderResponse;
import com.dy.order.domain.order.GetOrderUseCase;
import org.springframework.stereotype.Component;

@Component
public class GetOrderUseCaseImpl implements GetOrderUseCase {

    @Override
    public OrderResponse execute(String orderId) {
        return null;
    }
}
