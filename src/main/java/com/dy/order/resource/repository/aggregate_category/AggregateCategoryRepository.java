package com.dy.order.resource.repository.aggregate_category;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.google.cloud.firestore.Firestore;
import org.springframework.stereotype.Repository;

@Repository
public class AggregateCategoryRepository extends FirestoreRepository<AggregateCategoryEntity> {
    public AggregateCategoryRepository(Firestore firestore) {
        super(firestore, "aggregate_category");
    }
}
