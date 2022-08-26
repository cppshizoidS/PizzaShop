package com.cppshiz.dddworkshop.pizzashop.ordering.acl.payments;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.Ref;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;


@Value
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRef implements Ref {
    @NonFinal
    String reference;
}
