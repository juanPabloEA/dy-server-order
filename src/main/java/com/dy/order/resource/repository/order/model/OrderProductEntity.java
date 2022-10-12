package com.dy.order.resource.repository.order.model;

import com.google.cloud.firestore.DocumentReference;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProductEntity {
    private List<OrderAggregateEntity> aggregates;
    private DocumentReference productId;
    private Long quantity;
}
