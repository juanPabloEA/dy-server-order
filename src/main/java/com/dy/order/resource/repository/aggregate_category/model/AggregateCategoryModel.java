package com.dy.order.resource.repository.aggregate_category.model;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AggregateCategoryModel {
    private String id;
    private String name;
    private String description;
}
