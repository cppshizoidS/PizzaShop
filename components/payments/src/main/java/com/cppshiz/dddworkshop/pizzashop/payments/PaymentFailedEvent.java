package com.cppshiz.dddworkshop.pizzashop.payments;

import lombok.Value;


@Value
final class PaymentFailedEvent implements PaymentEvent {
    PaymentRef ref;
}
