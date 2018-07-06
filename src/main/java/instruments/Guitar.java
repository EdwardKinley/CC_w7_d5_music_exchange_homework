package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(int buyPrice, int sellPrice, int numberOfStrings) {
        super(buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getBuyPrice() {
        return this.getBuyPrice();
    }


}
