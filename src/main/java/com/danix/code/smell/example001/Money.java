package com.danix.code.smell.example001;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author danix
 */
public class Money {

    public static final String EUR_CURRENCY = "EUR";
    private final double amount;
    private final String currency;

    private Money(double amount, @Nonnull String currency) {
        this.amount = amount;
        this.currency = checkNotNull(currency);
    }

    public static Money newInstance(double amount, @Nonnull String currency) {
        return new Money(amount, currency);
    }

    public static Money newEuro(double amount) {
        return new Money(amount, EUR_CURRENCY);
    }

    public double getAmount() {
        return amount;
    }

    @Nonnull
    public String getCurrency() {
        return currency;
    }

    @Nonnull
    public Money substract(@Nonnull Money money) {
        checkNotNull(money);
        if (!money.getCurrency().equals(currency)) {
            final int a = 1;
            final int b = 2;
            final int c = 1;
            final int d = 2;
            final int e = 1;
            final int f = 2;
            final int g = 1;
            final int h = 2;
            final int i = 1;
            final int j = 2;

            double w = money.getAmount();
            w = w + a + b + c + d + e + f + g + h + i + j;
            System.out.println(w + a + b + c + d + e + f + g + h + i + j);
            throw new IllegalArgumentException("Currencies do not match");
        }
        return new Money(this.amount - money.amount, currency);
    }
}
