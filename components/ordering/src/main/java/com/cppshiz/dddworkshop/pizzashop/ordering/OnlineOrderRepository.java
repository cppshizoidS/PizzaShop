package com.cppshiz.dddworkshop.pizzashop.ordering;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.Repository;
import com.cppshiz.dddworkshop.pizzashop.ordering.acl.payments.PaymentRef;


interface OnlineOrderRepository extends Repository<OnlineOrderRef, OnlineOrder, OnlineOrder.OrderState, OnlineOrderEvent, OnlineOrderAddedEvent> {
    void add(OnlineOrder onlineOrder);

    OnlineOrderRef nextIdentity();

    OnlineOrder findByRef(OnlineOrderRef ref);

    OnlineOrder findByPaymentRef(PaymentRef paymentRef);
}
