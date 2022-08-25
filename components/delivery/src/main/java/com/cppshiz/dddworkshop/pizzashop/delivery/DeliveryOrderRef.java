package com.cppshiz.dddworkshop.pizzashop.delivery;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.domain.services.RefStringGenerator;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.Ref;
import lombok.Value;


@Value
public final class DeliveryOrderRef implements Ref {
    public static final DeliveryOrderRef IDENTITY = new DeliveryOrderRef("");
    String reference;

    @SuppressWarnings("WeakerAccess")
    public DeliveryOrderRef() {
        this.reference = RefStringGenerator.generateRefString();
    }

    @SuppressWarnings("SameParameterValue")
    DeliveryOrderRef(String reference) {
        this.reference = reference;
    }

    @Override
    public String getReference() {
        return reference;
    }
}
