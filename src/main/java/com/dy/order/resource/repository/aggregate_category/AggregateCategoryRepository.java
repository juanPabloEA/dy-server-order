package com.dy.order.resource.repository.aggregate_category;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.repository.aggregate_category.model.AggregateCategoryEntity;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class AggregateCategoryRepository extends FirestoreRepository<AggregateCategoryEntity> {
    public AggregateCategoryRepository(
            Firestore firestore,
            @Value("${firebase.config.collection.aggregate_category}") String collection) {
        super(firestore, collection);
    }
}
