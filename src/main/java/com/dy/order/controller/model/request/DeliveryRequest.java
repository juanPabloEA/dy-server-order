package com.dy.order.controller.model.request;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DeliveryRequest {

    private String direction;

    private String references;

    private Date date;

}
