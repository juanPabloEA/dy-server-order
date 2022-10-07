package com.dy.order.resource.repository.client;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository extends FirestoreRepository<ClientEntity> {

    public ClientRepository(Firestore firestore, @Value("${firestore.config.collection.client}") String collection) {
        super(firestore, collection);
    }

}
