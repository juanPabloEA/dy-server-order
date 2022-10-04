package com.dy.order.controller.model.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AggregatesRequest {

        private String id;

        private Integer quantity;

}
