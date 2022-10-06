package com.dy.order.resource.repository.aggregate;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.google.cloud.firestore.Firestore;
import org.springframework.stereotype.Repository;

@Repository
public class AggregateRepository extends FirestoreRepository<AggregateEntity> {
    public AggregateRepository(Firestore firestore) {
        super(firestore, "aggregates");
    }
}
