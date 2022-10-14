package com.dy.order.resource.repository.order.model;

import com.dy.order.resource.repository.products.model.ProductModel;
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
    private ProductModel productId;
    private Long quantity;
}
