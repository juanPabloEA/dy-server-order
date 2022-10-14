package com.dy.order.resource.repository.aggregate.impl;

import com.dy.order.resource.datasource.aggregate.Aggregate;
import com.dy.order.resource.repository.aggregate.AggregateRepository;
import com.dy.order.resource.repository.aggregate.mapper.AggregateMapper;
import com.dy.order.resource.repository.aggregate.model.AggregateModel;
import org.springframework.stereotype.Repository;

@Repository
public class AggregateRepositoryImpl implements AggregateRepository {

    private final Aggregate aggregate;

    public AggregateRepositoryImpl(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public AggregateModel getAggregateById(String id) {
        return aggregate.get(id).map(AggregateMapper::toUseCase).orElse(null);
    }

}
