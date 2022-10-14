package com.dy.order.resource.repository.client;

import com.dy.order.resource.repository.client.model.ClientModel;

public interface ClientRepository  {

    ClientModel getClientNameById(String id);
}
