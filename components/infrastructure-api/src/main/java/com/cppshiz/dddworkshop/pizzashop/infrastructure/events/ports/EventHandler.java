package com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports;


public interface EventHandler {
    void handleEvent(Event e);
}
