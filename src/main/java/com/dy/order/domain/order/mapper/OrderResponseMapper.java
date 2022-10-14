package com.dy.order.domain.order.mapper;

import com.dy.order.controller.model.response.OrderResponse;
import com.dy.order.resource.repository.order.model.OrderModel;
import lombok.*;

public class OrderResponseMapper {
    public static OrderResponse toController(OrderModel orderModel) {
        return OrderResponse.builder()
                .result("success")
                .orderModel(orderModel)
                .build();
    }
}
