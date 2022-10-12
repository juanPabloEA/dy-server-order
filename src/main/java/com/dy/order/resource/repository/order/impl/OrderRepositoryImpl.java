package com.dy.order.resource.repository.order.impl;

import com.dy.order.resource.datasource.order.Order;
import com.dy.order.resource.repository.order.OrderRepository;
import com.dy.order.resource.repository.order.mapper.OrderMapper;
import com.dy.order.resource.repository.order.model.OrderModel;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private final Order orderDataSource;

    public OrderRepositoryImpl(Order orderDataSource) {
        this.orderDataSource = orderDataSource;
    }

    @Override
    public OrderModel getOrderById(String orderId) {
        return orderDataSource.get(orderId)
                .map(OrderMapper::toUseCase)
                .orElse(null);
    }
}
