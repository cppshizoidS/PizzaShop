package com.cppshiz.dddworkshop.pizzashop.delivery;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.RepositoryAddEvent;
import lombok.Value;


@Value
class DeliveryOrderAddedEvent implements DeliveryOrderEvent, RepositoryAddEvent {
    DeliveryOrderRef ref;
    DeliveryOrder.OrderState state;
}
