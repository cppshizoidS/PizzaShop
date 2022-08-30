package com.cppshiz.dddworkshop.pizzashop.payments;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.domain.services.RefStringGenerator;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.Ref;
import lombok.Value;


@Value
public final class PaymentRef implements Ref {
    public static final PaymentRef IDENTITY = new PaymentRef("");
    String reference;

    public PaymentRef() {
        reference = RefStringGenerator.generateRefString();
    }

    @SuppressWarnings("SameParameterValue")
    PaymentRef(String reference) {
        this.reference = reference;
    }
}
