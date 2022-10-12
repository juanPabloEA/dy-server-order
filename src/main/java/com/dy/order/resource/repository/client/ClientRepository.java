package com.dy.order.resource.repository.client;

import com.dy.order.resource.config.firestore.FirestoreRepository;
import com.dy.order.resource.repository.client.model.ClientEntity;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository extends FirestoreRepository<ClientEntity> {

    public ClientRepository(Firestore firestore, @Value("${firebase.config.collection.client}") String collection) {
        super(firestore, collection);
    }

}
