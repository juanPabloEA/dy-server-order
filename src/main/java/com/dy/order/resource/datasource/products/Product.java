package com.dy.order.resource.datasource.products;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.datasource.products.model.ProductEntity;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Product extends FirestoreRepository<ProductEntity> {
    public Product(Firestore firestore, @Value("${firebase.config.collection.products}") String collection) {
        super(firestore, collection);
    }
}
