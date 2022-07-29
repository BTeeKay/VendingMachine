package VendingMachines;

import Coins.Coin;
import Coins.CoinReturn;

import java.util.ArrayList;

public class VendingMachine {

    ArrayList<Drawer> drawers;
    ArrayList<Coin> coins;
    CoinReturn coinReturn;
    ArrayList<Coin> customerTotalCoin;

    public VendingMachine(ArrayList<Drawer> drawers, ArrayList<Coin> coins, CoinReturn coinReturn) {
        this.drawers = drawers;
        this.coins = coins;
        this.coinReturn = coinReturn;
        this.customerTotalCoin = new ArrayList<Coin>();
    }

    public ArrayList<Drawer> getDrawers() {
        return drawers;
    }

    public void setDrawers(ArrayList<Drawer> drawers) {
        this.drawers = drawers;
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }

    public void setCoins(ArrayList<Coin> coins) {
        this.coins = coins;
    }

    public CoinReturn getCoinReturn() {
        return coinReturn;
    }

    public void setCoinReturn(CoinReturn coinReturn) {
        this.coinReturn = coinReturn;
    }

    public ArrayList<Coin> getCustomerTotalCoin() {
        return customerTotalCoin;
    }

    public void setCustomerTotalCoin(ArrayList<Coin> customerTotalCoin) {
        this.customerTotalCoin = customerTotalCoin;
    }

    public int totalCoinsInVM() {
        int total = 0;
        for (int i = 0; i < coins.size(); i++) {
            total += this.coins.get(i).getType().value;
        }
        return total;
    }

    public boolean customerAddCoin(Coin coin) {

        if (coin.getType().value == 1 || coin.getType().value == 2) {
            this.coinReturn.addACoin(coin);
            return false;
        }
        this.customerTotalCoin.add(coin);
        return true;
    }

//    public void customerEnterCode(Code code) {
//        for (int i = 0; i < this.getDrawers().size(); i++) {
//            if (this.getDrawers().get(i).getCode() == code) {
//
//            }
//        }
//    }


}
