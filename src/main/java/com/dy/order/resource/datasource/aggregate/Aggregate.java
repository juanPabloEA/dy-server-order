package com.dy.order.resource.datasource.aggregate;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.datasource.aggregate.model.AggregateEntity;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Aggregate extends FirestoreRepository<AggregateEntity> {
    public Aggregate(Firestore firestore, @Value("${firebase.config.collection.aggregates}") String collection) {
        super(firestore, collection);
    }
}
