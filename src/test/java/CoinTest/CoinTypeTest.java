package CoinTest;

import Coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTypeTest {

    CoinType coin;

    @Before
    public void before() {

    }

    @Test
    public void coinHasValue() {
        assertEquals(10, CoinType.TENPENCE.value);
    }
}
