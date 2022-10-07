package com.dy.order.resource.repository.aggregate;

import com.dy.order.resource.config.firestore.DocumentId;
import com.dy.order.resource.config.firestore.FirestoreUtil;
import com.dy.order.resource.config.firestore.Reference;
import com.dy.order.resource.repository.aggregate_category.AggregateCategoryEntity;
import com.google.cloud.firestore.DocumentReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AggregateEntity {
    @DocumentId
    private String id;
    private String name;
    private DocumentReference category;
    private  Long price;

    public Optional<AggregateCategoryEntity> getOptionalCategory() {
        try {
            return (Optional<AggregateCategoryEntity>) FirestoreUtil.getDocumentReferenceToObject(category, AggregateCategoryEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
