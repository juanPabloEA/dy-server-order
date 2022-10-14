package com.dy.order.resource.repository.client.mapper;

import com.dy.order.resource.datasource.client.model.ClientEntity;
import com.dy.order.resource.repository.client.model.ClientModel;

public class ClientMapper {
    public static ClientModel toUseCase(ClientEntity clientEntity) {
        return ClientModel.builder()
                .id(clientEntity.getId())
                .name(clientEntity.getName())
                .number(clientEntity.getNumber())
                .build();
    }
}
