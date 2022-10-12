package com.dy.order.resource.repository.products.model;

import com.dy.order.resource.repository.product_category.model.ProductCategoryModel;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductModel {
    private String id;
    private String name;
    private Long price;
    private ProductCategoryModel category;
}
