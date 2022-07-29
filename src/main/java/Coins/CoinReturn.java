package Coins;

import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> returnedCoins;

    public CoinReturn() {
        this.returnedCoins = new ArrayList<Coin>();
    }

    public ArrayList<Coin> getReturnedCoins() {
        return returnedCoins;
    }

    public void setReturnedCoins(ArrayList<Coin> returnedCoins) {
        this.returnedCoins = returnedCoins;
    }

    public void addACoin(Coin coin) {
        this.returnedCoins.add(coin);
    }

    public int totalValueOfCoins() {
        if (this.returnedCoins.size() == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < this.returnedCoins.size(); i++) {
            total += this.returnedCoins.get(i).getType().value;
        }
        return total;
    }

    public ArrayList<Coin> getReturnedCoinsAndEmpty() {
        ArrayList<Coin> newCoins = (ArrayList<Coin>) this.getReturnedCoins().clone();
        this.returnedCoins.clear();
        return newCoins;
    }
}
