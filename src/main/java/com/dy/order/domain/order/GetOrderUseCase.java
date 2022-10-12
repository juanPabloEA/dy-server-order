package com.dy.order.domain.order;

import com.dy.order.controller.model.response.OrderResponse;

public interface GetOrderUseCase {
    OrderResponse execute(String orderId);
}
