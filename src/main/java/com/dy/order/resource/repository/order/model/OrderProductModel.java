package com.dy.order.resource.repository.order.model;

import com.google.cloud.firestore.DocumentReference;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProductModel {
    private List<OrderAggregateModel> aggregates;
    private DocumentReference productId;
    private Long quantity;
}
