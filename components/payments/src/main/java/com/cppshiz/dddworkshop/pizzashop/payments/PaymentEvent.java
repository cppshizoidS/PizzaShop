package com.cppshiz.dddworkshop.pizzashop.payments;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.AggregateEvent;


interface PaymentEvent extends AggregateEvent {
    PaymentRef getRef();
}
