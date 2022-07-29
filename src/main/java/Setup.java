import Coins.Coin;
import Coins.CoinReturn;
import Coins.CoinType;
import Products.Crisp;
import Products.Drink;
import VendingMachines.Code;
import VendingMachines.Drawer;
import VendingMachines.VendingMachine;

import java.util.ArrayList;

public class Setup {

    static VendingMachine vendy;
    static CoinReturn coinReturn;
    static Drawer a1;
    static Drawer a2;
    static Drawer a3;
    static Coin one;
    static Coin two;
    static Coin five;
    static Coin ten;
    static Coin twenty;
    static Coin fifty;
    static Coin pound;
    static Crisp walkers;
    static Drink coke;

     static void setupInstances() {

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
}
