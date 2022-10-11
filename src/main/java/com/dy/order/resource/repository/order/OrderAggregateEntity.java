package com.dy.order.resource.repository.order;

import com.google.cloud.firestore.DocumentReference;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderAggregateEntity {
    private DocumentReference aggregateId;
    private Long quantity;
}
