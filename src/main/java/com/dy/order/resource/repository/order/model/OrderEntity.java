package com.dy.order.resource.repository.order.model;

import com.google.cloud.firestore.DocumentReference;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity {
    private DocumentReference clientId;
    private DeliveryEntity delivery;
    private Date orderDate;
    private OrderPaymentMethodEntity paymentMethod;
    private List<OrderProductEntity> products;
}
