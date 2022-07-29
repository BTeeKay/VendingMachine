import Coins.Coin;
import Coins.CoinReturn;
import Coins.CoinType;
import Products.Crisp;
import Products.Drink;
import VendingMachines.Code;
import VendingMachines.Drawer;
import VendingMachines.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class VendingMachineTest {

    VendingMachine vendy;
    CoinReturn coinReturn;
    Drawer a1;
    Drawer a2;
    Drawer a3;
    Coin one;
    Coin two;
    Coin five;
    Coin ten;
    Coin twenty;
    Coin fifty;
    Coin pound;
    Crisp walkers;
    Drink coke;

    @Before
    public void before() {
        one = new Coin(CoinType.ONEPENCE);
        two = new Coin(CoinType.TWOPENCE);
        five = new Coin(CoinType.FIVEPENCE);
        ten = new Coin(CoinType.TENPENCE);
        twenty = new Coin(CoinType.TWENTYPENCE);
        fifty = new Coin(CoinType.FIFTYPENCE);
        pound = new Coin(CoinType.ONEPOUND);
        walkers = new Crisp("Cheese and Onion", "Walkers");
        coke = new Drink("Coke Zero", "Coca Cola");
        a1 = new Drawer(Code.A1, 100);
        a2 = new Drawer(Code.A2, 100);
        a3 = new Drawer(Code.A3, 100);
        a1.addOneProduct(coke);
        a1.addOneProduct(coke);
        a1.addOneProduct(coke);
        a2.addOneProduct(coke);
        a2.addOneProduct(coke);
        a2.addOneProduct(coke);
        a3.addOneProduct(walkers);
        a3.addOneProduct(walkers);
        a3.addOneProduct(walkers);
        ArrayList<Drawer> newProducts = new ArrayList<Drawer>();
        newProducts.add(a1);
        newProducts.add(a2);
        newProducts.add(a3);
        ArrayList<Coin> newCoins = new ArrayList<Coin>();
        newCoins.add(one);
        newCoins.add(one);
        newCoins.add(one);
        newCoins.add(one);
        newCoins.add(one);
        newCoins.add(two);
        newCoins.add(two);
        newCoins.add(two);
        newCoins.add(two);
        newCoins.add(two);
        newCoins.add(five);
        newCoins.add(five);
        newCoins.add(five);
        newCoins.add(five);
        newCoins.add(five);
        newCoins.add(ten);
        newCoins.add(ten);
        newCoins.add(ten);
        newCoins.add(ten);
        newCoins.add(ten);
        newCoins.add(twenty);
        newCoins.add(twenty);
        newCoins.add(twenty);
        newCoins.add(twenty);
        newCoins.add(twenty);
        newCoins.add(fifty);
        newCoins.add(fifty);
        newCoins.add(fifty);
        newCoins.add(fifty);
        newCoins.add(fifty);
        newCoins.add(pound);
        newCoins.add(pound);
        newCoins.add(pound);
        newCoins.add(pound);
        newCoins.add(pound);
        coinReturn = new CoinReturn();
        vendy = new VendingMachine(newProducts, newCoins, coinReturn);
    }

    @Test
    public void vendyHasProductsInDrawer() {
        assertEquals("Walkers", vendy.getDrawers().get(2).getProducts().get(0).getBrand());
    }

    @Test
    public void vendyTotalStartingCoinValue() {
        assertEquals(940, vendy.totalCoinsInVM());
    }

    @Test
    public void customerCanAddValidCoin() {
        vendy.customerAddCoin(fifty);
        assertEquals(50, vendy.getCustomerTotalCoin().get(0).getType().value);
    }

    @Test
    public void customerCanNotAddInvalidCoin() {
        assertEquals(false, vendy.customerAddCoin(one));
    }

    @Test
    public void canGetCustomerTotalCoinValue() {
        vendy.customerAddCoin(fifty);
        vendy.customerAddCoin(fifty);
        vendy.customerAddCoin(fifty);
        vendy.customerAddCoin(fifty);
        assertEquals(200, vendy.customerTotalCoinValue());
    }

    @Test
    public void canGetCorrectCustomerChange() {
        vendy.getCoinReturn().setReturnedCoins(vendy.calculateCustomerChange(153));
        assertEquals(4, vendy.getCoinReturn().getReturnedCoins().size());
    }

    @Test
    public void customerCanBuyProduct() {
        vendy.customerAddCoin(fifty);
        vendy.customerAddCoin(fifty);
        vendy.customerAddCoin(fifty);
        vendy.customerAddCoin(fifty);
        assertEquals(0, vendy.customerEnterCode(Code.A3));
//        assertEquals(2, vendy.getDrawers().get(2).getProducts().size());
    }

    @Test
    public void testCustomerThing() {
        assertEquals(69, vendy.testEnterCode(Code.A1));
    }
}