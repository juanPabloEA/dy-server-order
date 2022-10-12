package com.dy.order.domain.order;

import com.dy.order.controller.model.request.OrderRequest;

public interface PutOrderUseCase {
    void execute(OrderRequest orderRequest);
}
