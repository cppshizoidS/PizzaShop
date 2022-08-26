package com.cppshiz.dddworkshop.pizzashop.ordering;

import lombok.Value;


@Value
final class OnlineOrderSubmittedEvent implements OnlineOrderEvent {
    OnlineOrderRef ref;
}
