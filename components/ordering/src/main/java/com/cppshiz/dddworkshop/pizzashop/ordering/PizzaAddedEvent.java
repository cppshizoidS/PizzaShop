package com.cppshiz.dddworkshop.pizzashop.ordering;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;


@Value
@AllArgsConstructor(access = AccessLevel.PACKAGE)
final class PizzaAddedEvent implements OnlineOrderEvent {
    private final OnlineOrderRef ref;
    private final Pizza pizza;
}
