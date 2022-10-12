package com.dy.order.resource.datasource.order;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.datasource.order.model.OrderEntity;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Order extends FirestoreRepository<OrderEntity> {
    protected Order(Firestore firestore, @Value("${firebase.config.collection.order}") String collection) {
        super(firestore, collection);
    }
}
