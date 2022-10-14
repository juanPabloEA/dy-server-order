package com.dy.order.controller.model.response;

import com.dy.order.resource.repository.order.model.OrderModel;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderResponse {
    private String result;
    private OrderModel orderModel;
}
