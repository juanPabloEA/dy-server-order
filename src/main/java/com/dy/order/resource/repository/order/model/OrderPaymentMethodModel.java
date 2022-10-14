package com.dy.order.resource.repository.order.model;

import com.dy.order.resource.repository.payment_method.model.PaymentMethodModel;
import com.google.cloud.firestore.DocumentReference;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderPaymentMethodModel {
    private Boolean status;
    private Long total;
    private PaymentMethodModel type;
}
