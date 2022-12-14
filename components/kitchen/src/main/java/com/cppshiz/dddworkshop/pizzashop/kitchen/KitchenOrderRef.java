package com.cppshiz.dddworkshop.pizzashop.kitchen;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.domain.services.RefStringGenerator;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.Ref;
import lombok.Value;

@Value
public final class KitchenOrderRef implements Ref {
    public static final KitchenOrderRef IDENTITY = new KitchenOrderRef("");
    private String reference;

    public KitchenOrderRef() {
        reference = RefStringGenerator.generateRefString();
    }

    @SuppressWarnings("SameParameterValue")
    public KitchenOrderRef(String reference) {
        this.reference = reference;
    }

    @Override
    public String getReference() {
        return reference;
    }
}
