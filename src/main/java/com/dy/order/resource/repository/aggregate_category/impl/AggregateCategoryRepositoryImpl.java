package com.dy.order.resource.repository.aggregate_category.impl;

import com.dy.order.resource.datasource.aggregate_category.AggregateCategory;
import com.dy.order.resource.repository.aggregate_category.AggregateCategoryRepository;
import com.dy.order.resource.repository.aggregate_category.mapper.AggregateCategoryMapper;
import com.dy.order.resource.repository.aggregate_category.model.AggregateCategoryModel;
import org.springframework.stereotype.Repository;

@Repository
public class AggregateCategoryRepositoryImpl implements AggregateCategoryRepository {

    private final AggregateCategory aggregateCategory;

    public AggregateCategoryRepositoryImpl(AggregateCategory aggregateCategory) {
        this.aggregateCategory = aggregateCategory;
    }

    @Override
    public AggregateCategoryModel getAggregateCategoryById(String id) {
        return aggregateCategory.get(id).map(AggregateCategoryMapper::toUseCase).orElse(null);
    }
}
