package CoinTest;

import Coins.Coin;
import Coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin ten;

    @Before
    public void before() {
        ten = new Coin(CoinType.TENPENCE);
    }

    @Test
    public void coinHasValueofTen() {
        assertEquals(10, ten.getType().value);
    }
}
