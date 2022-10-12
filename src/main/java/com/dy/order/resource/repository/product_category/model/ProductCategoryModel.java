package com.dy.order.resource.repository.product_category.model;

import com.dy.order.resource.config.firestore.DocumentId;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductCategoryModel {
    @DocumentId
    private String id;
    private String name;
    private String description;
}
