package com.cppshiz.dddworkshop.pizzashop.ordering;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.RepositoryAddEvent;
import lombok.Value;


@Value
final class OnlineOrderAddedEvent implements OnlineOrderEvent, RepositoryAddEvent {
    OnlineOrderRef ref;
    OnlineOrder.OrderState orderState;
}
