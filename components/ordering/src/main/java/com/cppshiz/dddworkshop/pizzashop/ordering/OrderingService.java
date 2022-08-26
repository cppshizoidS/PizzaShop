package com.cppshiz.dddworkshop.pizzashop.ordering;

interface OrderingService {
    OnlineOrderRef createOrder(OnlineOrder.Type type);

    void addPizza(OnlineOrderRef ref, Pizza pizza);

    void requestPayment(OnlineOrderRef ref);

    OnlineOrder findByRef(OnlineOrderRef ref);
}
