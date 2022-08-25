package com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.Event;


public interface AggregateEvent extends Event {
    @SuppressWarnings("EmptyMethod")
    Ref getRef();
}
