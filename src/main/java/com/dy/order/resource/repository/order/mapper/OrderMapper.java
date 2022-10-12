package com.dy.order.resource.repository.order.mapper;

import com.dy.order.resource.datasource.order.model.OrderEntity;
import com.dy.order.resource.repository.order.model.OrderModel;

public class OrderMapper {
    public static OrderModel toUseCase(OrderEntity orderEntity) {
        return OrderModel.builder()
                .build();
    }

}
