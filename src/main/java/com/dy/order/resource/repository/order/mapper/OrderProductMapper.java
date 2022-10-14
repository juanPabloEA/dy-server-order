package com.dy.order.resource.repository.order.mapper;

import com.dy.order.resource.datasource.order.model.OrderProductEntity;
import com.dy.order.resource.repository.aggregate.mapper.AggregateMapper;
import com.dy.order.resource.repository.order.model.OrderProductModel;
import com.dy.order.resource.repository.products.mapper.ProductMapper;

import java.util.stream.Collectors;

public class OrderProductMapper {
    public static OrderProductModel toUseCase(OrderProductEntity orderProductEntity) {
        return OrderProductModel.builder()
                .productId(orderProductEntity.getOptionalProduct().map(ProductMapper::toUseCase).orElse(null))
                .quantity(orderProductEntity.getQuantity())
                .aggregates(orderProductEntity.getAggregate().stream().map(OrderAggregateMapper::toUseCase).collect(Collectors.toList()))
                .build();
    }
}
