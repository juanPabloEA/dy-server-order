package com.dy.order.domain.order;

import com.dy.order.controller.model.request.OrderRequest;
import com.dy.order.controller.model.response.OrderResponse;

public interface OrderUseCase {
    void  addOrder(OrderRequest orderRequest);

    void  deleteOrder(String orderId);

    void  editOrder(OrderRequest orderRequest);

    OrderResponse getOrder(String id);
}
