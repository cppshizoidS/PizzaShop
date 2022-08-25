package com.cppshiz.dddworkshop.pizzashop.delivery.acl.kitchen;


public interface KitchenService {
    KitchenOrder findKitchenOrderByRef(KitchenOrderRef kitchenOrderRef);
}
