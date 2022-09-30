package com.dy.order.controller.model.request;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductRequest {

    private String size;

    private String biscuit;

    private String cover;

    private List<String> filling;

    private String observation;
}
