package com.cppshiz.dddworkshop.pizzashop.infrastructure.events.ports;



import java.util.List;


public interface EventLog {

    EventLog IDENTITY = new EventLog() {
        @Override
        public void publish(Topic topic, Event event) {

        }

        @Override
        public void subscribe(Topic topic, EventHandler handler) {

        }

        @Override
        public int getNumberOfSubscribers(Topic topic) {
            return -1;
        }

        @Override
        public List<Event> eventsBy(Topic topic) {
            return null;
        }
    };

    void publish(Topic topic, Event event);

    void subscribe(Topic topic, EventHandler handler);

    @SuppressWarnings("unused")
    int getNumberOfSubscribers(Topic topic);

    List<Event> eventsBy(Topic topic);

}
