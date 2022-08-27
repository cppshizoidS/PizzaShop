package com.cppshiz.dddworkshop.pizzashop.kitchen;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.RepositoryAddEvent;
import lombok.Value;

@Value
final class PizzaAddedEvent implements PizzaEvent, RepositoryAddEvent {
    PizzaRef ref;
    Pizza.PizzaState state;
}
