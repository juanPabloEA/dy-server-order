package com.dy.order.resource.repository.order.mapper;

import com.dy.order.resource.datasource.order.model.DeliveryEntity;
import com.dy.order.resource.repository.order.model.DeliveryModel;

public class DeliveryMapper {
    public static DeliveryModel toUseCase(DeliveryEntity delivery) {
        return DeliveryModel.builder()
                .date(delivery.getDate())
                .direction(delivery.getDirection())
                .reference(delivery.getReference())
                .build();
    }
}
