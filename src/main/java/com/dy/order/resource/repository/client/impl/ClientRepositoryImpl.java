package com.dy.order.resource.repository.client.impl;

import com.dy.order.resource.datasource.client.Client;
import com.dy.order.resource.repository.client.ClientRepository;
import com.dy.order.resource.repository.client.mapper.ClientMapper;
import com.dy.order.resource.repository.client.model.ClientModel;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    private final Client clientDataSource;

    public ClientRepositoryImpl(Client clientDataSource) {
        this.clientDataSource = clientDataSource;
    }

    @Override
    public ClientModel getClientNameById(String id) {
        return clientDataSource.get(id).map(ClientMapper::toUseCase).orElse(null);
    }
}
