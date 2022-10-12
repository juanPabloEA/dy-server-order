package com.dy.order.resource.repository.order;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.repository.order.model.OrderModel;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends FirestoreRepository<OrderModel> {
    protected OrderRepository(Firestore firestore, @Value("${firebase.config.collection.order}") String collection) {
        super(firestore, collection);
    }
}
