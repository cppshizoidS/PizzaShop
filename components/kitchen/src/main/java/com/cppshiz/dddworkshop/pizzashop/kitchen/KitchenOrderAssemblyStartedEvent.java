package com.cppshiz.dddworkshop.pizzashop.kitchen;

import lombok.Value;

@Value
final class KitchenOrderAssemblyStartedEvent implements KitchenOrderEvent {
    KitchenOrderRef ref;
}
