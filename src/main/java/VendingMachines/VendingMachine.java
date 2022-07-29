package VendingMachines;

import Coins.Coin;
import Coins.CoinReturn;
import Coins.CoinType;

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

    public int customerTotalCoinValue() {
        int total = 0;
        for (int i = 0; i < this.customerTotalCoin.size(); i++) {
            total += this.getCustomerTotalCoin().get(i).getType().value;
        }
        return total;
    }

    public ArrayList<Coin> calculateCustomerChange(int custChange) {
        ArrayList<Coin> customerChange = new ArrayList<Coin>();
        int one = 0;
        int two = 0;
        int five = 0;
        int ten = 0;
        int twenty = 0;
        int fifty = 0;
        int pound = 0;

        if (custChange == 0) {
            // return empty arraylist of change
            return customerChange;
        }

        for (Coin coin : this.getCoins()) {
            if (coin.getType() == CoinType.ONEPOUND) {
                pound += 1;
            }
            if (coin.getType() == CoinType.FIFTYPENCE) {
                fifty += 1;
            }
            if (coin.getType() == CoinType.TWENTYPENCE) {
                twenty += 1;
            }
            if (coin.getType() == CoinType.TENPENCE) {
                ten += 1;
            }
            if (coin.getType() == CoinType.FIVEPENCE) {
                five += 1;
            }
            if (coin.getType() == CoinType.TWOPENCE) {
                two += 1;
            }
            if (coin.getType() == CoinType.ONEPENCE) {
                one += 1;
            }
        }

        while (custChange >= 100 && pound > 0) {
            Coin coin = new Coin(CoinType.ONEPOUND);
            customerChange.add(coin);
            this.coins.remove(coin);
            pound -= 1;
            custChange -= 100;
        }

        while (custChange >= 50 && fifty > 0) {
            Coin coin = new Coin(CoinType.FIFTYPENCE);
            customerChange.add(coin);
            this.coins.remove(coin);
            fifty -= 1;
            custChange -= 50;
        }

        while (custChange >= 20 && twenty > 0) {
            Coin coin = new Coin(CoinType.TWENTYPENCE);
            customerChange.add(coin);
            this.coins.remove(coin);
            twenty -= 1;
            custChange -= 20;
        }

        while (custChange >= 10 && ten > 0) {
            Coin coin = new Coin(CoinType.TENPENCE);
            customerChange.add(coin);
            this.coins.remove(coin);
            ten -= 1;
            custChange -= 10;
        }

        while (custChange >= 5 && five > 0) {
            Coin coin = new Coin(CoinType.FIVEPENCE);
            customerChange.add(coin);
            this.coins.remove(coin);
            five -= 1;
            custChange -= 5;
        }

        while (custChange >= 2 && two > 0) {
            Coin coin = new Coin(CoinType.TWOPENCE);
            customerChange.add(coin);
            this.coins.remove(coin);
            two -= 1;
            custChange -= 2;
        }

        while (custChange >= 1 && one > 0) {
            Coin coin = new Coin(CoinType.ONEPENCE);
            customerChange.add(coin);
            this.coins.remove(coin);
            one -= 1;
            custChange -= 1;
        }

        return customerChange;
    }

    public int customerEnterCode(Code code) {
        for (int i = 0; i < this.getDrawers().size(); i++) {

            if (this.getDrawers().get(i).getCode() == code) {
                System.out.println("This is equal");

                if (this.getDrawers().get(i).getProducts().size() == 0) {
                    return 2;
                }

                if (this.customerTotalCoinValue() >= this.getDrawers().get(i).getPrice()) {
                    System.out.println("is this getting here?");
                    int custChange = customerTotalCoinValue();
                    custChange -= this.getDrawers().get(i).getPrice();
                    this.coinReturn.setReturnedCoins(calculateCustomerChange(custChange));
                    this.getDrawers().remove(i);
                    return 0;
                }
            }
        }
        return 1;
    }

    public int testEnterCode(Code code) {
        if (this.getDrawers().get(0).getCode() == code) {
            return 69;
        }
        return 0;
    }


}
