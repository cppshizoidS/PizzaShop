package com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.EventLog;

import java.util.function.BiFunction;


public interface Aggregate<E extends AggregateEvent> {

    Aggregate identity();

    BiFunction<Aggregate, E, Aggregate> accumulatorFunction(EventLog eventLog);

    Ref getRef();

    AggregateState state();

}
