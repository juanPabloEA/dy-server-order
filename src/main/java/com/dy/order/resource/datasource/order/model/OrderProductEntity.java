package com.dy.order.resource.datasource.order.model;

import com.dy.order.resource.config.firestore.FirestoreUtil;
import com.dy.order.resource.datasource.aggregate.model.AggregateEntity;
import com.dy.order.resource.datasource.products.model.ProductEntity;
import com.google.cloud.firestore.DocumentReference;
import lombok.*;

import java.util.List;
import java.util.Optional;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProductEntity {
    private List<OrderAggregateEntity> aggregates;
    private DocumentReference productId;
    private Long quantity;

    public Optional<ProductEntity> getOptionalProduct() {
        try {
            return (Optional<ProductEntity>) FirestoreUtil.getDocumentReferenceToObject(productId, ProductEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
