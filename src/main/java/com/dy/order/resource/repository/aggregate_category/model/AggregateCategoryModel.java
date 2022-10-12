package com.dy.order.resource.repository.aggregate_category.model;

import com.dy.order.resource.config.firestore.DocumentId;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AggregateCategoryModel {
    @DocumentId
    private String id;
    private String name;
    private String description;
}
