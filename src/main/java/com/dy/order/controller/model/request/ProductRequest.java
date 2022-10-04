package com.dy.order.controller.model.request;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductRequest {

    private String id;

    private Integer quantity;

    private List<AggregatesRequest> aggregate;

}
