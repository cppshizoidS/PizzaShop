package com.cppshiz.dddworkshop.pizzashop.delivery;

import com.cppshiz.dddworkshop.pizzashop.delivery.acl.kitchen.KitchenOrderRef;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.Repository;


interface DeliveryOrderRepository extends Repository<DeliveryOrderRef, DeliveryOrder, DeliveryOrder.OrderState, DeliveryOrderEvent, DeliveryOrderAddedEvent> {
    DeliveryOrder findByKitchenOrderRef(KitchenOrderRef kitchenOrderRef);
}
