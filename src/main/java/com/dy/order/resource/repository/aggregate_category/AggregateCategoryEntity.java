package com.dy.order.resource.repository.aggregate_category;

import com.dy.order.resource.config.firestore.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AggregateCategoryEntity {

    @DocumentId
    private String id;
    private String name;
    private String description;
}
