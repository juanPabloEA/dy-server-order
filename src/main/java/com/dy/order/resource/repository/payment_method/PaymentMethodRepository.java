package com.dy.order.resource.repository.payment_method;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.repository.payment_method.model.PaymentMethodModel;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentMethodRepository extends FirestoreRepository<PaymentMethodModel> {
    public PaymentMethodRepository(Firestore firestore, @Value("${firebase.config.collection.payment_method}") String collection) {
        super(firestore, collection);
    }
}
