package com.dy.order.controller.model.request;

import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderRequest {

    private PaymentMethodRequest paymentMethod;

    private Date orderDate;

    private List<ProductRequest> products;

    private ClientRequest client;

    private DeliveryRequest delivery;

}
