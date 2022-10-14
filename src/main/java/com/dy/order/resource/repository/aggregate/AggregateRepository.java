package com.dy.order.resource.repository.aggregate;

import com.dy.order.resource.repository.aggregate.model.AggregateModel;

public interface AggregateRepository {
    AggregateModel getAggregateById(String id);
}
