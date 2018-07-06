package instruments;

public abstract class Instrument {

    private int buyPrice;
    private int sellPrice;

    public Instrument(int buyPrice, int sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }



}
