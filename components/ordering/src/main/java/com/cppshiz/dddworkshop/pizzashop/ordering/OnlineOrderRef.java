package com.cppshiz.dddworkshop.pizzashop.ordering;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.domain.services.RefStringGenerator;
import com.cppshiz.dddworkshop.pizzashop.infrastructure.repository.ports.Ref;
import lombok.Value;


@Value
public final class OnlineOrderRef implements Ref {
    public static final OnlineOrderRef IDENTITY = new OnlineOrderRef("");
    String reference;

    public OnlineOrderRef() {
        reference = RefStringGenerator.generateRefString();
    }

    public OnlineOrderRef(String reference) {
        this.reference = reference;
    }

    @Override
    public String getReference() {
        return reference;
    }
}
