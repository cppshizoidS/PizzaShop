package com.cppshiz.dddworkshop.pizzashop.payments;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.RepositoryAddEvent;
import lombok.Value;


@Value
final class PaymentAddedEvent implements PaymentEvent, RepositoryAddEvent {
    PaymentRef ref;
    Payment.PaymentState paymentState;
}
