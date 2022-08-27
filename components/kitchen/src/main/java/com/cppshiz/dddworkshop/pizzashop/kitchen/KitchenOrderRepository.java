package com.cppshiz.dddworkshop.pizzashop.kitchen;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.Repository;
import com.cppshiz.dddworkshop.pizzashop.kitchen.acl.ordering.OnlineOrderRef;

interface KitchenOrderRepository extends Repository<KitchenOrderRef, KitchenOrder, KitchenOrder.OrderState, KitchenOrderEvent, KitchenOrderAddedEvent> {
    KitchenOrder findByOnlineOrderRef(OnlineOrderRef onlineOrderRef);
}
