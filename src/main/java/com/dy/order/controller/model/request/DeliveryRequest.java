package com.dy.order.controller.model.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DeliveryRequest {

    private String direction;

    private String references;

}
