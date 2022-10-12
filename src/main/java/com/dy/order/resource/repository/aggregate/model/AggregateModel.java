package com.dy.order.resource.repository.aggregate.model;

import com.dy.order.resource.config.firestore.DocumentId;
import com.dy.order.resource.config.firestore.FirestoreUtil;
import com.dy.order.resource.repository.aggregate_category.model.AggregateCategoryModel;
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
public class AggregateModel {
    @DocumentId
    private String id;
    private String name;
    private DocumentReference category;
    private  Long price;

    public Optional<AggregateCategoryModel> getOptionalCategory() {
        try {
            return (Optional<AggregateCategoryModel>) FirestoreUtil.getDocumentReferenceToObject(category, AggregateCategoryModel.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
