package com.dy.order.resource.repository.aggregate.model;

import com.dy.order.resource.repository.aggregate_category.model.AggregateCategoryModel;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class AggregateModel {
    private String id;
    private String name;
    private AggregateCategoryModel category;
    private  Long price;
}
