package com.dy.order.resource.repository.aggregate_category;

import com.dy.order.resource.repository.aggregate_category.model.AggregateCategoryModel;

public interface AggregateCategoryRepository  {
    AggregateCategoryModel getAggregateCategoryById(String id);
}
