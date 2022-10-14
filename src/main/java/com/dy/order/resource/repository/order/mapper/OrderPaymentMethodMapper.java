package com.dy.order.resource.repository.order.mapper;

import com.dy.order.resource.datasource.order.model.OrderPaymentMethodEntity;
import com.dy.order.resource.repository.order.model.OrderPaymentMethodModel;
import com.dy.order.resource.repository.payment_method.mapper.PaymentMethodMapper;

public class OrderPaymentMethodMapper {
    public static OrderPaymentMethodModel toUseCase(OrderPaymentMethodEntity paymentMethod) {
        return OrderPaymentMethodModel.builder()
                .status(paymentMethod.getStatus())
                .total(paymentMethod.getTotal())
                .type(paymentMethod.getOptionalPaymentType().map(PaymentMethodMapper::toUseCase).orElse(null))
                .build();
    }
}
