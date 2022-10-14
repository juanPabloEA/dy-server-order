package com.dy.order.resource.repository.payment_method.mapper;

import com.dy.order.resource.datasource.payment_method.model.PaymentMethodEntity;
import com.dy.order.resource.repository.payment_method.model.PaymentMethodModel;
import com.google.cloud.firestore.DocumentReference;

public class PaymentMethodMapper {

    public static PaymentMethodModel toUseCase(PaymentMethodEntity paymentMethodEntity) {
        return PaymentMethodModel.builder()
                .id(paymentMethodEntity.getId())
                .name(paymentMethodEntity.getName())
                .description(paymentMethodEntity.getDescription())
                .build();
    }
}
