package com.danix.code.smell.example001;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * @author danix
 */
public class MoneyTest {


    @Test
    public void testSubstract() throws Exception {
        Money difference = Money.newEuro(20.0).substract(Money.newEuro(10.0));
        Assert.assertThat(difference.getAmount(), is(10.0));
        Assert.assertThat(difference.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference2 = Money.newEuro(20.0).substract(Money.newEuro(20.0));
        Assert.assertThat(difference2.getAmount(), is(0.0));
        Assert.assertThat(difference2.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference3 = Money.newEuro(20.0).substract(Money.newEuro(15.0));
        Assert.assertThat(difference3.getAmount(), is(5.0));
        Assert.assertThat(difference3.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference4 = Money.newEuro(20.0).substract(Money.newEuro(1.0));
        Assert.assertThat(difference4.getAmount(), is(19.0));
        Assert.assertThat(difference4.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference5 = Money.newEuro(20.0).substract(Money.newEuro(2.0));
        Assert.assertThat(difference5.getAmount(), is(18.0));
        Assert.assertThat(difference5.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference6 = Money.newEuro(20.0).substract(Money.newEuro(14.0));
        Assert.assertThat(difference6.getAmount(), is(6.0));
        Assert.assertThat(difference6.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference7 = Money.newEuro(20.0).substract(Money.newEuro(13.0));
        Assert.assertThat(difference7.getAmount(), is(7.0));
        Assert.assertThat(difference7.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference8 = Money.newEuro(20.0).substract(Money.newEuro(9.0));
        Assert.assertThat(difference8.getAmount(), is(11.0));
        Assert.assertThat(difference8.getCurrency(), is(Money.EUR_CURRENCY));
    }

    @Test
    public void testSubstractNegative() throws Exception {
        Money difference = Money.newEuro(20.0).substract(Money.newEuro(100.0));
        Assert.assertThat(difference.getAmount(), is(-80.0));
        Assert.assertThat(difference.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference2 = Money.newEuro(20.0).substract(Money.newEuro(110.0));
        Assert.assertThat(difference2.getAmount(), is(-90.0));
        Assert.assertThat(difference2.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference3 = Money.newEuro(20.0).substract(Money.newEuro(90.0));
        Assert.assertThat(difference3.getAmount(), is(-70.0));
        Assert.assertThat(difference3.getCurrency(), is(Money.EUR_CURRENCY));

        Money difference4 = Money.newEuro(20.0).substract(Money.newEuro(200.0));
        Assert.assertThat(difference4.getAmount(), is(-180.0));
        Assert.assertThat(difference4.getCurrency(), is(Money.EUR_CURRENCY));
    }

}
