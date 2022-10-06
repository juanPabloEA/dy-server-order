package com.dy.order.service.order.impl;

import com.dy.order.resource.repository.aggregate.AggregateEntity;
import com.dy.order.resource.repository.aggregate.AggregateRepository;
import com.dy.order.service.order.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final AggregateRepository aggregateRepository;

    public OrderServiceImpl(AggregateRepository aggregateRepository) {
        this.aggregateRepository = aggregateRepository;
    }

    @Override
    public AggregateEntity getAggregate(String id) {
        return aggregateRepository.get(id).orElseGet(null);
    }

}
