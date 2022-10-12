package com.dy.order.resource.repository.order.model;

import com.google.cloud.firestore.DocumentReference;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderAggregateModel {
    private DocumentReference aggregateId;
    private Long quantity;
}
