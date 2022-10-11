package com.dy.order.resource.repository.products;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository extends FirestoreRepository<ProductEntity> {
    public ProductRepository(Firestore firestore, @Value("${firebase.config.collection.products}") String collection) {
        super(firestore, collection);
    }
}
