package com.dy.order.resource.datasource.order.model;

import com.dy.order.resource.config.firestore.FirestoreUtil;
import com.dy.order.resource.datasource.aggregate.model.AggregateEntity;
import com.google.cloud.firestore.DocumentReference;
import lombok.*;

import java.util.Optional;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderAggregateEntity {
    private DocumentReference aggregateId;
    private Long quantity;

    public Optional<AggregateEntity> getOptionalAggregate() {
        try {
            return (Optional<AggregateEntity>) FirestoreUtil.getDocumentReferenceToObject(aggregateId, AggregateEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
