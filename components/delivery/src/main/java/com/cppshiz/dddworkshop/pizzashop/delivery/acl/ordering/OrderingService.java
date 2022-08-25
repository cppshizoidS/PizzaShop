package com.cppshiz.dddworkshop.pizzashop.delivery.acl.ordering;


public interface OrderingService {
    OnlineOrder findByRef(OnlineOrderRef ref);
}
