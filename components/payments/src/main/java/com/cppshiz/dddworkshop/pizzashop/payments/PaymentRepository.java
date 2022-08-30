package com.cppshiz.dddworkshop.pizzashop.payments;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.Repository;


interface PaymentRepository extends Repository<PaymentRef, Payment, Payment.PaymentState, PaymentEvent, PaymentAddedEvent> {
}
