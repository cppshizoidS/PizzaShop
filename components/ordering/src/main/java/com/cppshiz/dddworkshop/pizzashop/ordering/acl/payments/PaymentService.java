package com.cppshiz.dddworkshop.pizzashop.ordering.acl.payments;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.domain.valuetypes.Amount;


public interface PaymentService {
    PaymentRef createPaymentOf(Amount of);

    void requestPaymentFor(PaymentRef ref);
}
