package com.dy.order.resource.repository.products.model;

import com.dy.order.resource.config.firestore.DocumentId;
import com.dy.order.resource.config.firestore.FirestoreUtil;
import com.dy.order.resource.repository.product_category.model.ProductCategoryModel;
import com.google.cloud.firestore.DocumentReference;
import lombok.*;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductModel {
    @DocumentId
    private String id;
    private String name;
    private Long price;
    private DocumentReference category;

    public Optional<ProductCategoryModel> getOptionalCategory() {
        try {
            return (Optional<ProductCategoryModel>) FirestoreUtil.getDocumentReferenceToObject(category, ProductCategoryModel.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
