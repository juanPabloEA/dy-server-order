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

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AggregateEntity {
    @DocumentId
    private String id;
    private String name;

    @Reference(AggregateCategoryEntity.class)
    private DocumentReference category;
    private  Long price;

    public AggregateCategoryEntity getCategory() {
        try {
            var res = FirestoreUtil.getDocumentReferenceToObject(category, AggregateCategoryEntity.builder().build().getClass()).orElse(null);
            return (AggregateCategoryEntity) res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
