package com.cppshiz.dddworkshop.pizzashop.kitchen.acl.ordering;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.Event;
import lombok.Value;
import lombok.experimental.NonFinal;


@Value
public class OnlineOrderPaidEvent implements Event {
    @NonFinal
    OnlineOrderRef ref;
}
