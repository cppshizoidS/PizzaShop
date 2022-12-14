package com.cppshiz.dddworkshop.pizzashop.ordering;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PizzaTests {

    @Test
    public void calculates_price() {
        Pizza pizza = Pizza.builder().size(Pizza.Size.MEDIUM).build();
        assertThat(pizza.calculatePrice()).isEqualTo(Pizza.Size.MEDIUM.getPrice());
    }

}
