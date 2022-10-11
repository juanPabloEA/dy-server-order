package com.dy.order.domain.order.impl;

import com.dy.order.controller.model.request.OrderRequest;
import com.dy.order.controller.model.response.OrderResponse;
import com.dy.order.domain.order.OrderUseCase;
import com.dy.order.service.order.OrderService;
import org.springframework.stereotype.Component;


@Component
public class OrderUsesCaseImpl implements OrderUseCase {

    private final OrderService orderService;
    public OrderUsesCaseImpl(OrderService orderService) {
        this.orderService = orderService;
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
        var res = orderService.getOrder(id);
        return OrderResponse.builder().result("Ok").build();
    }
}
