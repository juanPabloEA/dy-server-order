package com.dy.order.resource.repository.order.model;

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
    private DocumentReference type;
}
