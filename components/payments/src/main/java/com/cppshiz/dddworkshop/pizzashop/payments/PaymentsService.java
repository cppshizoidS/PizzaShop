package com.cppshiz.dddworkshop.pizzashop.payments;

import com.cppshiz.dddworkshop.pizzashop.infrastructure.domain.valuetypes.Amount;

interface PaymentService {
    PaymentRef createPaymentOf(Amount of);

    void requestPaymentFor(PaymentRef ref);
}
