package com.dy.order.resource.repository.order.mapper;

import com.dy.order.resource.datasource.order.model.OrderEntity;
import com.dy.order.resource.repository.client.mapper.ClientMapper;
import com.dy.order.resource.repository.order.model.OrderModel;
import com.dy.order.resource.repository.products.mapper.ProductMapper;

import java.util.stream.Collectors;

public class OrderMapper {
    public static OrderModel toUseCase(OrderEntity orderEntity) {
        return OrderModel.builder()
                .clientId(orderEntity.getOptionalClient().map(ClientMapper::toUseCase).orElse(null))
                .delivery(DeliveryMapper.toUseCase(orderEntity.getDelivery()))
                .orderDate(orderEntity.getOrderDate())
                .paymentMethod(OrderPaymentMethodMapper.toUseCase(orderEntity.getPaymentMethod()))
                .products(orderEntity.getProducts().stream().map(OrderProductMapper::toUseCase).collect(Collectors.toList()))
                .build();
    }

}
