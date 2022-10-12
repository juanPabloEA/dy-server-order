package com.dy.order.domain.order;

import com.dy.order.controller.model.request.OrderRequest;

public interface PostOrderUseCase {
    void execute(OrderRequest orderRequest);
}
