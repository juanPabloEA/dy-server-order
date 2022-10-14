package com.dy.order.resource.repository.product_category.mapper;

import com.dy.order.resource.datasource.product_category.model.ProductCategoryEntity;
import com.dy.order.resource.repository.product_category.model.ProductCategoryModel;

public class ProductCategoryMapper {
    public static ProductCategoryModel toUseCase(ProductCategoryEntity productCategoryEntity) {
        return ProductCategoryModel.builder()
                .id(productCategoryEntity.getId())
                .name(productCategoryEntity.getName())
                .description(productCategoryEntity.getDescription())
                .build();
    }
}
