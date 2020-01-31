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
            final double a = 1;
            final double b = 2;
            final double c = 1;
            final double d = 2;
            final double e = 1;
            final double f = 2;
            final double g = 1;
            final double h = 2;
            final double i = 1;
            final double j = 2;
            final double l = 2;

            double w = money.getAmount();
            w = w + a + b + c + d + e + f + g + h + i + j;

            double p = a + c;
            double k = i * j + l;
            double z = p + k - i - j - f;

            if(this.amount != z + w) {
                throw new IllegalArgumentException("Currencies do not match");
            }
        }
        return new Money(this.amount - money.amount, currency);
    }
}
