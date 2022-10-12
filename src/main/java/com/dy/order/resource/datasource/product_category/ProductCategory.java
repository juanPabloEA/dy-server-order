package com.dy.order.resource.datasource.product_category;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.datasource.product_category.model.ProductCategoryEntity;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ProductCategory extends FirestoreRepository<ProductCategoryEntity> {
    public ProductCategory(Firestore firestore, @Value("${firebase.config.collection.product_category}") String collection) {
        super(firestore, collection);
    }
}
