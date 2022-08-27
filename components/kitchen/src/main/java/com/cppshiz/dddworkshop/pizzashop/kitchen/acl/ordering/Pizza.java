package com.cppshiz.dddworkshop.pizzashop.kitchen.acl.ordering;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.domain.valuetypes.Amount;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;


@Value
public final class Pizza {

    Size size;

    @SuppressWarnings("unused")
    @Builder
    private Pizza(@NonNull Size size) {
        this.size = size;
    }

    public enum Size {
        MEDIUM(Amount.of(6, 0));

        final Amount price;

        Size(Amount price) {
            this.price = price;
        }
    }
}
