package Coins;

public enum CoinType {

    ONEPENCE(1),
    TWOPENCE(2),
    FIVEPENCE(5),
    TENPENCE(10),
    TWENTYPENCE(20),
    FIFTYPENCE(50),
    ONEPOUND(100);

    public final int value;

    private CoinType(int i) {
        this.value = i;
    }
}
