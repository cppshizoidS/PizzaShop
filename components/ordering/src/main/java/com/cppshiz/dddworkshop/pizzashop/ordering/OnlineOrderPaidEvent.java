package com.cppshiz.dddworkshop.pizzashop.ordering;

import lombok.Value;


@Value
final class OnlineOrderPaidEvent implements OnlineOrderEvent {
    OnlineOrderRef ref;
}
