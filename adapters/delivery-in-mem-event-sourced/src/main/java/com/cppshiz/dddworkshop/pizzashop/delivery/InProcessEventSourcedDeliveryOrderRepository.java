package com.cppshiz.dddworkshop.pizzashop.delivery;

import com.cppshiz.dddworkshop.pizzashop.delivery.acl.kitchen.KitchenOrderRef;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.EventLog;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.Topic;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.adapters.InProcessEventSourcedRepository;

import java.util.HashMap;
import java.util.Map;

final class InProcessEventSourcedDeliveryOrderRepository extends InProcessEventSourcedRepository<DeliveryOrderRef, DeliveryOrder, DeliveryOrder.OrderState, DeliveryOrderEvent, DeliveryOrderAddedEvent> implements DeliveryOrderRepository {

    private final Map<KitchenOrderRef, DeliveryOrderRef> kitchenOrderRefToDeliveryOrderRef;

    InProcessEventSourcedDeliveryOrderRepository(EventLog eventLog, Topic topic) {
        super(eventLog,
                DeliveryOrderRef.class,
                DeliveryOrder.class,
                DeliveryOrder.OrderState.class,
                DeliveryOrderAddedEvent.class,
                topic);

        kitchenOrderRefToDeliveryOrderRef = new HashMap<>();

        eventLog.subscribe(topic, e -> {
            if (e instanceof DeliveryOrderAddedEvent) {
                kitchenOrderRefToDeliveryOrderRef.put(((DeliveryOrderAddedEvent) e)
                                .getState()
                                .getKitchenOrderRef(),
                        ((DeliveryOrderAddedEvent) e).getRef());
            }
        });
    }

    @Override
    public DeliveryOrder findByKitchenOrderRef(KitchenOrderRef kitchenOrderRef) {
        DeliveryOrderRef ref = kitchenOrderRefToDeliveryOrderRef.get(kitchenOrderRef);
        if (ref != null) {
            return this.findByRef(ref);
        }
        return null;
    }
}
