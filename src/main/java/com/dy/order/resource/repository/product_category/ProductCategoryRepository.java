package com.dy.order.resource.repository.product_category;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.repository.product_category.model.ProductCategoryEntity;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ProductCategoryRepository extends FirestoreRepository<ProductCategoryEntity> {
    public ProductCategoryRepository(Firestore firestore, @Value("${firebase.config.collection.product_category}") String collection) {
        super(firestore, collection);
    }
}
