package com.cppshiz.dddworkshop.pizzashop.kitchen;

import lombok.Value;

@Value
final class KitchenOrderAssemblyFinishedEvent implements KitchenOrderEvent {
    KitchenOrderRef ref;
}
