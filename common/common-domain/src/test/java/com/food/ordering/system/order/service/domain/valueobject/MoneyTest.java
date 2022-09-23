package com.food.ordering.system.order.service.domain.valueobject;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class MoneyTest {

    @Test
    public void compare() {
        Money zero = new Money(new BigDecimal("0.00"));
        System.out.println(new BigDecimal("0"));
        System.out.println(BigDecimal.ZERO);
        System.out.println(zero.equals(new Money(BigDecimal.ZERO)));
    }

}