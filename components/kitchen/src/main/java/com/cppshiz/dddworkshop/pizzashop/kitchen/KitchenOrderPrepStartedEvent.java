package com.cppshiz.dddworkshop.pizzashop.kitchen;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.Event;
import lombok.Value;

@Value
final class KitchenOrderPrepStartedEvent implements Event, KitchenOrderEvent {
    KitchenOrderRef ref;
}
