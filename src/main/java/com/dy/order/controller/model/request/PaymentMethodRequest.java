package com.dy.order.controller.model.request;

import com.dy.order.domain.order.enums.PaymentMethodEnum;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PaymentMethodRequest {
    private PaymentMethodEnum paymentMethod;
    private Boolean status;
}
