package com.cppshiz.dddworkshop.pizzashop.payments;

import lombok.Value;

@Value
final class PaymentSuccessfulEvent implements PaymentEvent {
    PaymentRef ref;
}
