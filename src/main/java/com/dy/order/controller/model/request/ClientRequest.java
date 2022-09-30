package com.dy.order.controller.model.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ClientRequest {

    private String name;

    private String cellphone;
}
