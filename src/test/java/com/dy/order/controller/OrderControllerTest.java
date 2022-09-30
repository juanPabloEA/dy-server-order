package com.dy.order.controller;

import com.dy.order.controller.model.request.OrderRequest;
import com.dy.order.controller.model.response.OrderResponse;
import com.dy.order.domain.order.OrderUseCase;
import com.dy.order.domain.order.impl.OrderUsesCaseImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OrderControllerTest {

    @InjectMocks
    OrderController orderController;

    @Mock
    OrderUsesCaseImpl orderUsesCase;

    @Test
    void addOrder_thenReturnOk_Test(){
        OrderRequest orderRequest = mock(OrderRequest.class);

        doNothing().when(orderUsesCase).addOrder(orderRequest);

        ResponseEntity<OrderResponse> res = orderController.addOrder(orderRequest);

        assertNotNull(res);
        assertEquals(HttpStatus.OK, res.getStatusCode());
    }

}
