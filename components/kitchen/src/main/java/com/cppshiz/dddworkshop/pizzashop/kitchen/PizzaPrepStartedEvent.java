package com.cppshiz.dddworkshop.pizzashop.kitchen;

import lombok.Value;

@Value
final class PizzaPrepStartedEvent implements PizzaEvent {
    PizzaRef ref;
}
