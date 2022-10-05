package com.dy.order.domain.order.impl;

import com.dy.order.controller.model.request.OrderRequest;
import com.dy.order.controller.model.response.OrderResponse;
import com.dy.order.domain.order.OrderUseCase;
import com.dy.order.resource.repository.aggregate_category.AggregateCategoryRepository;
import org.springframework.stereotype.Component;


@Component
public class OrderUsesCaseImpl implements OrderUseCase {

    private final AggregateCategoryRepository aggregateCategoryRepository;

    public OrderUsesCaseImpl(AggregateCategoryRepository aggregateCategoryRepository) {
        this.aggregateCategoryRepository = aggregateCategoryRepository;
    }

    @Override
    public void  addOrder(OrderRequest orderRequest) {

    }

    @Override
    public void  deleteOrder(String orderId) {
    }

    @Override
    public void  editOrder(OrderRequest orderRequest) {

    }

    @Override
    public OrderResponse getOrder(String id) {
        return OrderResponse.builder().result("Ok").build();
    }
}
