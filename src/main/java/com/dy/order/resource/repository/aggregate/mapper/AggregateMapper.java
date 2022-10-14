package com.dy.order.resource.repository.aggregate.mapper;

import com.dy.order.resource.datasource.aggregate.model.AggregateEntity;
import com.dy.order.resource.repository.aggregate.model.AggregateModel;
import com.dy.order.resource.repository.aggregate_category.mapper.AggregateCategoryMapper;

public class AggregateMapper {
    public static AggregateModel toUseCase(AggregateEntity aggregateEntity) {
        return AggregateModel.builder()
                .id(aggregateEntity.getId())
                .name(aggregateEntity.getName())
                .category(aggregateEntity.getOptionalCategory().map(AggregateCategoryMapper::toUseCase).orElse(null))
                .price(aggregateEntity.getPrice())
                .build();
    }
}
