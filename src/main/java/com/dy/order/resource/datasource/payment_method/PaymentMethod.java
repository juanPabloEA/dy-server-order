package com.dy.order.resource.datasource.payment_method;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.datasource.payment_method.model.PaymentMethodEntity;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentMethod extends FirestoreRepository<PaymentMethodEntity> {
    public PaymentMethod(Firestore firestore, @Value("${firebase.config.collection.payment_method}") String collection) {
        super(firestore, collection);
    }
}
