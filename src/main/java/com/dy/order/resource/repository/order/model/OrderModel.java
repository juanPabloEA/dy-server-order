package com.dy.order.resource.repository.order.model;

import com.dy.order.resource.repository.client.model.ClientModel;
import com.google.cloud.firestore.DocumentReference;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderModel {
    private ClientModel clientId;
    private DeliveryModel delivery;
    private Date orderDate;
    private OrderPaymentMethodModel paymentMethod;
    private List<OrderProductModel> products;
}
