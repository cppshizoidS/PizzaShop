package com.cppshiz.dddworkshop.pizzashop.kitchen.acl.ordering;


public interface OrderingService {
    OnlineOrder findByRef(OnlineOrderRef ref);
}
