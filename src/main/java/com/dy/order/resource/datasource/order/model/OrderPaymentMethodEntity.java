package com.dy.order.resource.datasource.order.model;

import com.dy.order.resource.config.firestore.FirestoreUtil;
import com.dy.order.resource.datasource.aggregate.model.AggregateEntity;
import com.dy.order.resource.datasource.payment_method.model.PaymentMethodEntity;
import com.google.cloud.firestore.DocumentReference;
import lombok.*;

import java.util.Optional;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderPaymentMethodEntity {
    private Boolean status;
    private Long total;
    private DocumentReference type;

    public Optional<PaymentMethodEntity> getOptionalPaymentType() {
        try {
            return (Optional<PaymentMethodEntity>) FirestoreUtil.getDocumentReferenceToObject(type, PaymentMethodEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
