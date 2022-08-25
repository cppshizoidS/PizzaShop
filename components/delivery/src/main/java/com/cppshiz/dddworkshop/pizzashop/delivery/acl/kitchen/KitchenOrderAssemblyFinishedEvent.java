package com.cppshiz.dddworkshop.pizzashop.delivery.acl.kitchen;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.Event;
import lombok.Value;


@Value
public class KitchenOrderAssemblyFinishedEvent implements Event {
    KitchenOrderRef ref;
}
