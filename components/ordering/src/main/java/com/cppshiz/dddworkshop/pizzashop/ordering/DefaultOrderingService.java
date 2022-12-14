package com.cppshiz.dddworkshop.pizzashop.ordering;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.domain.valuetypes.Amount;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.EventLog;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.Topic;
import com.cppshiz.dddworkshop.pizzashop.ordering.acl.payments.PaymentRef;
import com.cppshiz.dddworkshop.pizzashop.ordering.acl.payments.PaymentService;
import com.cppshiz.dddworkshop.pizzashop.ordering.acl.payments.PaymentSuccessfulEvent;


final class DefaultOrderingService implements OrderingService {
    private final EventLog eventLog;
    private final OnlineOrderRepository repository;
    private final PaymentService paymentService;

    DefaultOrderingService(EventLog eventLog, OnlineOrderRepository repository, PaymentService paymentService) {
        this.eventLog = eventLog;
        this.repository = repository;
        this.paymentService = paymentService;

        eventLog.subscribe(new Topic("payments"), e -> {
            if (e instanceof PaymentSuccessfulEvent) {
                PaymentSuccessfulEvent pse = (PaymentSuccessfulEvent) e;
                this.markOrderPaid(pse.getRef());
            }
        });
    }

    @Override
    public OnlineOrderRef createOrder(OnlineOrder.Type type) {
        OnlineOrderRef ref = repository.nextIdentity();

        OnlineOrder order = OnlineOrder.builder().type(type)
                .eventLog(eventLog)
                .ref(ref)
                .build();

        repository.add(order);

        return ref;
    }

    @Override
    public void addPizza(OnlineOrderRef ref, Pizza pizza) {
        OnlineOrder onlineOrder = repository.findByRef(ref);
        onlineOrder.addPizza(pizza);
    }

    @Override
    public void requestPayment(OnlineOrderRef ref) {
        PaymentRef paymentRef = paymentService.createPaymentOf(Amount.of(10, 0));
        paymentService.requestPaymentFor(paymentRef);
        OnlineOrder onlineOrder = repository.findByRef(ref);
        onlineOrder.assignPaymentRef(paymentRef);
    }

    @Override
    public OnlineOrder findByRef(OnlineOrderRef ref) {
        return repository.findByRef(ref);
    }

    private void markOrderPaid(PaymentRef paymentRef) {
        OnlineOrder onlineOrder = repository.findByPaymentRef(paymentRef);
        onlineOrder.markPaid();
    }
}
