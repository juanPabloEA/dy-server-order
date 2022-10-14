package com.dy.order.resource.repository.order.model;

import com.dy.order.resource.repository.aggregate.model.AggregateModel;
import com.google.cloud.firestore.DocumentReference;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderAggregateModel {
    private AggregateModel aggregateId;
    private Long quantity;
}
