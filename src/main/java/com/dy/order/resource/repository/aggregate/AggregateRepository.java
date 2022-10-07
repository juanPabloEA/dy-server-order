package com.dy.order.resource.repository.aggregate;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class AggregateRepository extends FirestoreRepository<AggregateEntity> {
    public AggregateRepository(Firestore firestore, @Value("${firestore.config.collection.aggregate}") String collection) {
        super(firestore, collection);
    }
}
