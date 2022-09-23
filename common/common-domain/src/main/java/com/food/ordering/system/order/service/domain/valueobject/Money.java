package com.food.ordering.system.order.service.domain.valueobject;

import java.math.BigDecimal;
import java.util.Objects;

public class Money {
    private final BigDecimal amount;
    public static final Money ZERO = new Money(BigDecimal.ZERO);

    public BigDecimal getAmount() {
        return amount;
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isGreaterThanZero() {
        return this.amount != null && this.amount.compareTo(BigDecimal.ZERO) > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount.equals(money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    public Money add(Money money) {
        return new Money(money.amount.add(this.amount));
    }

    public Money multiply(int quantity) {
        return new Money(amount.multiply(new BigDecimal(quantity)));
    }
}
