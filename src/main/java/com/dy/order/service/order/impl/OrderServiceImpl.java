package com.dy.order.service.order.impl;

import com.dy.order.resource.repository.aggregate.AggregateEntity;
import com.dy.order.resource.repository.aggregate.AggregateRepository;
import com.dy.order.resource.repository.order.OrderEntity;
import com.dy.order.resource.repository.order.OrderRepository;
import com.dy.order.service.order.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final AggregateRepository aggregateRepository;
    private final OrderRepository orderRepository;

    public OrderServiceImpl(AggregateRepository aggregateRepository, OrderRepository orderRepository) {
        this.aggregateRepository = aggregateRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public AggregateEntity getAggregate(String id) {
        return aggregateRepository.get(id).orElseGet(null);
    }

    @Override
    public OrderEntity getOrder(String id) {
        return orderRepository.get(id).orElseGet(null);
    }

}
