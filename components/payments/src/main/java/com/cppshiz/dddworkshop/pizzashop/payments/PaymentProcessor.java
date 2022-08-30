package com.cppshiz.dddworkshop.pizzashop.payments;



interface PaymentProcessor {
    PaymentProcessor IDENTITY = payment -> {

    };

    @SuppressWarnings({"EmptyMethod", "unused"})
    void request(Payment payment);
}
