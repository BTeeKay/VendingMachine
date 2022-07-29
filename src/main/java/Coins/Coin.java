package Coins;

public class Coin {

    CoinType type;

    public Coin(CoinType type) {
        this.type = type;
    }

    public CoinType getType() {
        return type;
    }

    public void setType(CoinType type) {
        this.type = type;
    }
}