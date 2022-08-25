package com.cppshiz.dddworkshop.pizzashop.delivery.acl.ordering;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;


@Value
@NoArgsConstructor
@AllArgsConstructor
public class OnlineOrderRef {
    public static final OnlineOrderRef IDENTITY = new OnlineOrderRef("");
    @NonFinal
    String reference;
}
