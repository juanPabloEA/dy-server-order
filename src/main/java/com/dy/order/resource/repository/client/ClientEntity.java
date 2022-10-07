package com.dy.order.resource.repository.client;

import com.dy.order.resource.config.firestore.DocumentId;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientEntity {

    @DocumentId
    private String id;
    private String name;
    private Long number;
}
