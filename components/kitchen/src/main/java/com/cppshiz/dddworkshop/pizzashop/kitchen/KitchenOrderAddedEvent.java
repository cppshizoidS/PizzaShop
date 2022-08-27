package com.cppshiz.dddworkshop.pizzashop.kitchen;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.RepositoryAddEvent;
import lombok.Value;

@Value
final class KitchenOrderAddedEvent implements KitchenOrderEvent, RepositoryAddEvent {
    KitchenOrderRef ref;
    KitchenOrder.OrderState state;
}
