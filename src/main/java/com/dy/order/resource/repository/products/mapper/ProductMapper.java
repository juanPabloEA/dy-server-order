package com.dy.order.resource.repository.products.mapper;

import com.dy.order.resource.datasource.products.model.ProductEntity;
import com.dy.order.resource.repository.aggregate_category.mapper.AggregateCategoryMapper;
import com.dy.order.resource.repository.product_category.mapper.ProductCategoryMapper;
import com.dy.order.resource.repository.products.model.ProductModel;

public class ProductMapper {
    public static ProductModel toUseCase(ProductEntity productEntity) {
        return ProductModel.builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .price(productEntity.getPrice())
                .category(productEntity.getOptionalCategory()
                        .map(ProductCategoryMapper::toUseCase)
                        .orElse(null))
                .build();
    }
}
