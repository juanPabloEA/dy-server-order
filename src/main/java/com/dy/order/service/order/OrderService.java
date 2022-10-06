package com.dy.order.service.order;

import com.dy.order.resource.repository.aggregate.AggregateEntity;

public interface OrderService {
    AggregateEntity getAggregate(String id);
}
