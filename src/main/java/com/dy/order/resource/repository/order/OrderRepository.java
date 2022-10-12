package com.dy.order.resource.repository.order;

import com.dy.order.resource.repository.order.model.OrderModel;

public interface OrderRepository  {

    OrderModel getOrderById(String orderId);
}
