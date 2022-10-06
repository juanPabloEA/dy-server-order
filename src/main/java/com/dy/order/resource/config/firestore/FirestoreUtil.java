package com.dy.order.resource.config.firestore;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

public class FirestoreUtil {

    public static Optional<?> getDocumentReferenceToObject(DocumentReference documentReference, Class<?> clazz) throws ExecutionException, InterruptedException {
        ApiFuture<DocumentSnapshot> documentSnapshotApiFuture = documentReference.get();
        DocumentSnapshot documentSnapshot = documentSnapshotApiFuture.get();
        if (documentSnapshot.exists()) {
            return Optional.ofNullable(documentSnapshot.toObject(clazz));
        }
        return Optional.empty();
    }
}
