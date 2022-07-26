package com.dy.order.resource.repository.order.model;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeliveryModel {
    private Date date;
    private String direction;
    private String reference;
}
