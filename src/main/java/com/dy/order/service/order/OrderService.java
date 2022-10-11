package com.dy.order.service.order;

import com.dy.order.resource.repository.aggregate.AggregateEntity;
import com.dy.order.resource.repository.order.OrderEntity;

public interface OrderService {
    AggregateEntity getAggregate(String id);
    OrderEntity getOrder(String id);
}
