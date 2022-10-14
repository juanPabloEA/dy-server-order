package com.dy.order.resource.repository.aggregate_category.mapper;

import com.dy.order.resource.datasource.aggregate_category.model.AggregateCategoryEntity;
import com.dy.order.resource.repository.aggregate_category.model.AggregateCategoryModel;

public class AggregateCategoryMapper {
    public static AggregateCategoryModel toUseCase(AggregateCategoryEntity aggregateCategoryEntity) {
        return AggregateCategoryModel.builder()
                .id(aggregateCategoryEntity.getId())
                .name(aggregateCategoryEntity.getName())
                .description(aggregateCategoryEntity.getDescription())
                .build();
    }
}
