package CoinTest;

import Coins.Coin;
import Coins.CoinReturn;
import Coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    Coin one;
    Coin two;
    Coin five;
    Coin fifty;
    CoinReturn coinReturn;

    @Before
    public void before() {
        one = new Coin(CoinType.ONEPENCE);
        two = new Coin(CoinType.TWOPENCE);
        five = new Coin(CoinType.FIVEPENCE);
        fifty = new Coin(CoinType.FIFTYPENCE);
        coinReturn = new CoinReturn();
    }

    @Test
    public void returnCoinStartsEmpty() {
        assertEquals(0, coinReturn.getReturnedCoins().size());
    }

    @Test
    public void canAddOneCoin() {
        coinReturn.addACoin(fifty);
        assertEquals(1, coinReturn.getReturnedCoins().size());
    }
    
    @Test
    public void canAddListOfCoins() {
        ArrayList<Coin> newCoins = new ArrayList<Coin>();
        newCoins.add(one);
        newCoins.add(five);
        newCoins.add(fifty);
        coinReturn.setReturnedCoins(newCoins);
        assertEquals(3, coinReturn.getReturnedCoins().size());
    }

    @Test
    public void canGetTotalValueOfCoins() {
        coinReturn.addACoin(fifty);
        coinReturn.addACoin(one);
        coinReturn.addACoin(one);
        assertEquals(52, coinReturn.totalValueOfCoins());
    }

    @Test
    public void canGetReturnedCoinsAndEmptyTheList() {
        coinReturn.addACoin(fifty);
        coinReturn.addACoin(one);
        coinReturn.addACoin(one);
        ArrayList<Coin> testCoins = coinReturn.getReturnedCoinsAndEmpty();
        assertEquals(0, coinReturn.getReturnedCoins().size());
        assertEquals(3, testCoins.size());
    }

    @Test
    public void canGetTotalValueOfCoinsIfNothingInArray() {
        assertEquals(0, coinReturn.totalValueOfCoins());
    }
}
