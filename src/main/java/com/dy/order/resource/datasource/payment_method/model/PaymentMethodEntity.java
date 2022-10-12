package com.dy.order.resource.datasource.payment_method.model;

import com.dy.order.resource.config.firestore.DocumentId;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class PaymentMethodEntity {

    @DocumentId
    private String id;
    private String name;
    private String description;
}
