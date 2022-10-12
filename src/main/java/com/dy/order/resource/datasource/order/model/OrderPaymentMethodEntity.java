package com.dy.order.resource.datasource.order.model;

import com.google.cloud.firestore.DocumentReference;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderPaymentMethodEntity {
    private Boolean status;
    private Long total;
    private DocumentReference type;
}
