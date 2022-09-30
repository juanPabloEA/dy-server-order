package com.dy.order.domain.order.impl;

import com.dy.order.controller.model.request.OrderRequest;
import com.dy.order.controller.model.response.OrderResponse;
import com.dy.order.domain.order.OrderUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class OrderUsesCaseImpl implements OrderUseCase {

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
