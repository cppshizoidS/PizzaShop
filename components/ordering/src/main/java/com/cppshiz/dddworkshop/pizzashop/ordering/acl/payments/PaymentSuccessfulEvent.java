package com.cppshiz.dddworkshop.pizzashop.ordering.acl.payments;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.Event;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
public class PaymentSuccessfulEvent implements Event {
    @NonFinal
    PaymentRef ref;
}
