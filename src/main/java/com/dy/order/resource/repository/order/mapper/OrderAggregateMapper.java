package com.dy.order.resource.repository.order.mapper;

import com.dy.order.resource.datasource.order.model.OrderAggregateEntity;
import com.dy.order.resource.repository.aggregate.mapper.AggregateMapper;
import com.dy.order.resource.repository.order.model.OrderAggregateModel;

public class OrderAggregateMapper {
    public static OrderAggregateModel toUseCase(OrderAggregateEntity orderAggregateEntity) {
        return OrderAggregateModel.builder()
                .aggregateId(orderAggregateEntity.getOptionalAggregate().map(AggregateMapper::toUseCase).orElse(null))
                .quantity(orderAggregateEntity.getQuantity())
                .build();
    }
}
