package com.cppshiz.dddworkshop.pizzashop.payments;

import lombok.Value;


@Value
final class PaymentRequestedEvent implements PaymentEvent {
    PaymentRef ref;
}
