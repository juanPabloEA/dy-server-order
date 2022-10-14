package com.dy.order.resource.datasource.order.model;

import com.dy.order.resource.config.firestore.FirestoreUtil;
import com.dy.order.resource.datasource.aggregate.model.AggregateEntity;
import com.dy.order.resource.datasource.client.model.ClientEntity;
import com.google.cloud.firestore.DocumentReference;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity {
    private DocumentReference clientId;
    private DeliveryEntity delivery;
    private Date orderDate;
    private OrderPaymentMethodEntity paymentMethod;
    private List<OrderProductEntity> products;

    public Optional<ClientEntity> getOptionalClient() {
        try {
            return (Optional<ClientEntity>) FirestoreUtil.getDocumentReferenceToObject(clientId, ClientEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
