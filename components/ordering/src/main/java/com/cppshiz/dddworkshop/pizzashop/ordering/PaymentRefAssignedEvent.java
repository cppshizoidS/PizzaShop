package com.cppshiz.dddworkshop.pizzashop.ordering;

import com.cppshiz.dddworkshop.pizzashop.ordering.acl.payments.PaymentRef;
import lombok.Value;


@Value
final class PaymentRefAssignedEvent implements OnlineOrderEvent {
    OnlineOrderRef ref;
    PaymentRef paymentRef;
}
