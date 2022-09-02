package com.cppshiz.dddworkshop.pizzashop.infrastructure.events.adapters;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.Event;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports.EventHandler;


abstract class VerifiableEventHandler implements EventHandler {
    @SuppressWarnings("WeakerAccess")
    protected boolean invoked = false;

    static VerifiableEventHandler of(EventHandler eventHandler) {
        return new VerifiableEventHandler() {
            @Override
            public void handleEvent(Event e) {
                this.invoked = true;
                eventHandler.handleEvent(e);
            }
        };
    }

    boolean isInvoked() {
        return invoked;
    }
}
