package com.cppshiz.dddworkshop.pizzashop.kitchen;

import com.cppshiz.dddworkshop.pizzashop.kitchen.acl.ordering.OnlineOrderRef;

import java.util.Set;


interface KitchenService {
    void startOrderPrep(KitchenOrderRef kitchenOrderRef);

    void finishPizzaPrep(PizzaRef ref);

    void removePizzaFromOven(PizzaRef ref);

    KitchenOrder findKitchenOrderByOnlineOrderRef(OnlineOrderRef onlineOrderRef);

    KitchenOrder findKitchenOrderByRef(KitchenOrderRef kitchenOrderRef);

    Pizza findPizzaByRef(PizzaRef ref);

    Set<Pizza> findPizzasByKitchenOrderRef(KitchenOrderRef kitchenOrderRef);
}
